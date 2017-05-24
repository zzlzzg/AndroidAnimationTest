package com.tiaopi.androidanimationtest;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//<set
////执行的顺序together同时执行，sequentially连续执行
//        android:ordering=["together" | "sequentially"]>
//
//        <objectAnimator
//        //属性动画名字，例如alpha" 或者"backgroundColor"等
//        android:propertyName="string"
//        android:duration="int"
//        //属性的开始值
//        android:valueFrom="float | int | color"
//        android:valueTo="float | int | color"
//        //该动画开始的延迟时间
//        android:startOffset="int"
//        //动画重复次数，-1表示一直循环，1表示循环一次也就是播放两次，默认0，播放一次
//        android:repeatCount="int"
//        //repeatCount设置-1时才会有效果
//        android:repeatMode=["repeat" | "reverse"]
//        //如果值是颜色，则不用使用此属性
//        android:valueType=["intType" | "floatType"]/>
//
//        <animator
//        android:duration="int"
//        android:valueFrom="float | int | color"
//        android:valueTo="float | int | color"
//        android:startOffset="int"
//        android:repeatCount="int"
//        android:repeatMode=["repeat" | "reverse"]
//        android:valueType=["intType" | "floatType"]/>
//
//        <set>
//        ...
//        </set>
//        </set>

//translationX 和 translationY : 控制View距离左边和顶部的距离的增加值。是一个相对值。相对于自身位置的具体。
//        rotation 、 rotationX 和 rotationY : rotation 是控制View围绕其支点进行旋转。 rotationX 和 rotationY 分别是围绕X轴和Y轴旋转。
//
//        scaleX 和 scaleY : 控制View的缩放。
//
//        pivotX 和 pivotY : 控制View的支点位置，进行旋转和缩放，默认是View的中点。它们都是 float 值， 0 表示View的最左边和最顶端， 1 表示最右端和最下端。
//
//        alpha : 控制View的透明度。
//
//        x 和 y : 控制View在布局容器中距离左边和顶部的距离。是一个绝对值。

/**
 * 属性动画是3.0之后引入的，在View动画中虽然我们看到了我们的控件位置发生发生变化，
 * 比如Button虽然位置变化了，但是点击响应区域还在原来的位置。
 * 而属性动画就可以解决这种问题。它可以作用于View的属性。
 */

public class ProptertyAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propterty_animation);

        final ImageView imageView = (ImageView) findViewById(R.id.tween_image_view);

        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.propterty_animation_test);

//        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this,
//                R.animator.property_animator);
//
//        findViewById(R.id.start_button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {

//            }
//        });


    }
}
