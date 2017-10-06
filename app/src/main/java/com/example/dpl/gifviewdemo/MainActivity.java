package com.example.dpl.gifviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cunoraz.gifview.library.GifView;

/*
加载本地GIF图片，使用gifView
 */
public class MainActivity extends AppCompatActivity {
    private GifView gifView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gifView= (GifView) findViewById(R.id.gifView);
        //设置图片源
        gifView.setGifResource(R.drawable.wanshengjie);//本地图片
        //位置设置
        gifView.setX(150);
        gifView.setY(300);
    }
}
