package com.tiaopi.androidanimationtest;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Frame Animation 帧动画
 */

//<animation-list xmlns:android="http://schemas.android.com/apk/res/android"
//        android:oneshot=["true" | "false"] >
//        <item
//        android:drawable="@[package:]drawable/drawable_resource_name"
//        android:duration="integer" />
//        </animation-list>

public class FrameAnimationActivity extends AppCompatActivity {

    private int[] mipmaps = new int[]{
            R.mipmap.frame_image_1,
            R.mipmap.frame_image_2,
            R.mipmap.frame_image_3,
            R.mipmap.frame_image_4,
            R.mipmap.frame_image_5,
            R.mipmap.frame_image_6,
            R.mipmap.frame_image_7,
            R.mipmap.frame_image_9,
            R.mipmap.frame_image_10,
            R.mipmap.frame_image_11,
            R.mipmap.frame_image_12,
            R.mipmap.frame_image_13,
            R.mipmap.frame_image_14,
            R.mipmap.frame_image_15,
            R.mipmap.frame_image_16,
            R.mipmap.frame_image_17,
            R.mipmap.frame_image_18,
            R.mipmap.frame_image_19,
            R.mipmap.frame_image_20,
            R.mipmap.frame_image_21,
            R.mipmap.frame_image_22,
            R.mipmap.frame_image_23,
            R.mipmap.frame_image_24,
            R.mipmap.frame_image_25,
            R.mipmap.frame_image_26,
            R.mipmap.frame_image_27,
            R.mipmap.frame_image_28,
            R.mipmap.frame_image_29,
            R.mipmap.frame_image_30
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        /**
         * 通过xml文件
         */
        ImageView imgView = (ImageView) findViewById(R.id.image_view);
        imgView.setBackgroundResource(R.drawable.frame_animation_test1);
        AnimationDrawable animDraw = (AnimationDrawable) imgView.getBackground();
        animDraw.start();

        /**
         * 通过代码
         */
        ImageView imgView2 = (ImageView) findViewById(R.id.image_view2);
        AnimationDrawable animDraw2 = new AnimationDrawable();
        for (int i = 0; i < mipmaps.length ; i++) {

            Drawable d = ContextCompat.getDrawable(this,mipmaps[i]);
            animDraw2.addFrame(d,200);
        }
        animDraw2.setOneShot(false);
        imgView2.setBackground(animDraw2);
        animDraw2.start();

    }
}
