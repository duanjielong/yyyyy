package com.fivehundredpx.blurdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.RecyclerHolder> {
    private Context mContext;
    private List<String> dataList = new ArrayList<>();

    public MyRecyclerViewAdapter(RecyclerView recyclerView) {
        this.mContext = recyclerView.getContext();
    }

    public void setData(List<String> dataList) {
        if (null != dataList) {
            this.dataList.clear();
            this.dataList.addAll(dataList);
            notifyDataSetChanged();
        }
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.id_rv_item_layout, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        //holder.blurring_view.(dataList.get(position));
//        Blurry.with(holder.mBlurryLayout.getContext())
//                .radius(85)
//                .sampling(90)
//                .color(Color.argb(180, 255, 255, 255))
//                .async()
//                .animate(500)
//                .onto(holder.mBlurryLayout);
        holder.tv_1.setText(dataList.get(position));
        holder.mBlurringView.setBlurredView(holder.blurredView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder {
        BlurringView mBlurringView;
        View blurredView;
        TextView tv_1;
        FrameLayout mBlurryLayout;

        private RecyclerHolder(View itemView) {
            super(itemView);
            mBlurringView = (BlurringView) itemView.findViewById(R.id.blurring_view);
            blurredView =itemView.findViewById(R.id.blurred_view);


            mBlurryLayout =(FrameLayout) itemView.findViewById(R.id.blurry2);
            // 高斯模糊
       /*     Blurry.with(mBlurryLayout.getContext())
                    .radius(25)
                    .sampling(2)
                    .color(Color.argb(180, 255, 255, 255))
                    .onto(mBlurryLayout);
*/
           /* Blurry.with(itemView.getContext())
                    .radius(25)
                    .sampling(1)
                    .color(Color.argb(66, 0, 200, 200))
                    .async()
                    .capture((FrameLayout) itemView.findViewById(R.id.blurry2))
                    .into((ImageView) itemView.findViewById(R.id.blurry3));*/





           // Blurry.with(mBlurryLayout.getContext()).radius(25).sampling(2).onto(mBlurryLayout);
            tv_1=(TextView)itemView.findViewById(R.id.tv_1);
        }
    }
}