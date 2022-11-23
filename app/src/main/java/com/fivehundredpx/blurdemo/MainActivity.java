package com.fivehundredpx.blurdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of the blurring view.
 */
public class MainActivity extends Activity {
    RecyclerView mRecyclerView;
    FrameLayout ttttt;
    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // BlurringView mBlurringView = (BlurringView) findViewById(R.id.blurring_view);
       // View blurredView = findViewById(R.id.blurring_view);

        // Give the blurring view a reference to the blurred view.
       // mBlurringView.setBlurredView(blurredView);
//
//        mImageViews[0] = (ImageView) findViewById(R.id.image0);
//        mImageViews[1] = (ImageView) findViewById(R.id.image1);
//        mImageViews[2] = (ImageView) findViewById(R.id.image2);
//        mImageViews[3] = (ImageView) findViewById(R.id.image3);
//        mImageViews[4] = (ImageView) findViewById(R.id.image4);
//        mImageViews[5] = (ImageView) findViewById(R.id.image5);
//        mImageViews[6] = (ImageView) findViewById(R.id.image6);
//        mImageViews[7] = (ImageView) findViewById(R.id.image7);
//        mImageViews[8] = (ImageView) findViewById(R.id.image8);



      mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,
                3, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        MyRecyclerViewAdapter mAdapter = new MyRecyclerViewAdapter(mRecyclerView);
        List<String> src=new ArrayList<>();
        int i;
        for(i=0;i<50;i++){
            src.add(i+"===");
        }
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData(src);
        mAdapter.notifyDataSetChanged();
        ttttt=(FrameLayout)findViewById(R.id.ttttt);
        ttttt.post(new Runnable(){
            @Override
            public void run() {

            }
        });
//        Bitmap bitmap = Blurry.with(this)
//                .radius(10)
//                .sampling(8)
//                .capture(findViewById(R.id.imageView)).get();
//        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmap));

       /* ttttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blurry.with(MainActivity.this)
                        .radius(25)
                        .sampling(1)
                        .color(Color.argb(66, 0, 255, 255))
                        .async()
                        .animate(500)
                        .onto(ttttt);

            }
        });*/

    }







}
