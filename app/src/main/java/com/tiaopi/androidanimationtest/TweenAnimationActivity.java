package com.tiaopi.androidanimationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//<?xml version="1.0" encoding="utf-8"?>
//        <set xmlns:android="http://schemas.android.com/apk/res/android"
//        //插值器
//        android:interpolator="@[package:]anim/interpolator_resource"
//        //动画结束后View是否停留在结束的位置
//        android:fillAfter=["true" | "false"]
//        //重复的模式,默认为restart,即重头开始重新运行,reverse即从结束开始向前重新运行
//        android:repeatMode="restart/reverse"
//        //子元素是否共用此插值器
//        android:shareInterpolator=["true" | "false"] >
//        <alpha
//        //开始透明度0.0（全透明）到1.0（完全不透明）
//        android:fromAlpha="float"
//        android:toAlpha="float"
//        //动画执行时间
//        android:duration="integer" />
//        <scale
//        //其实X缩放大于0,1的时候表示不缩放，小于1缩小，大于1放大
//        android:fromXScale="float"
//        android:toXScale="float"
//        android:fromYScale="float"
//        android:toYScale="float"
//        //缩放中心，也可以穿fraction值
//        android:pivotX="float"
//        android:pivotY="float"
//        android:duration="integer" />
//        <translate
//        //表示 x 的起始值
//        android:fromXDelta="float/fraction"
//        android:toXDelta="float"
//        android:fromYDelta="float"
//        android:toYDelta="float"
//        android:duration="integer" />
//        <rotate
//        //起始的旋转角度
//        android:fromDegrees="float"
//        android:toDegrees="float"
//        android:pivotX="float"
//        android:pivotY="float"
//        android:duration="integer"  />
//        <set>
//        ...
//        </set>
//        </set>

public class TweenAnimationActivity extends AppCompatActivity {

//    AnimationSet，
//    TranslateAnimation，
//    ScaleAnimation，
//    AlphaAnimation，
//    RotateAnimation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        final ImageView imageView = (ImageView) findViewById(R.id.tween_image_view);

        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.tween_animation_test);

        findViewById(R.id.start_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animation);
            }
        });

    }
}
