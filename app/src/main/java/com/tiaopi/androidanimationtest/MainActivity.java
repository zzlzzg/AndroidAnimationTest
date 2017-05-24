package com.tiaopi.androidanimationtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.frame_animation_button).setOnClickListener(this);
        findViewById(R.id.tween_animation_button).setOnClickListener(this);
        findViewById(R.id.property_animation_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.frame_animation_button:
                intent.setClass(this,FrameAnimationActivity.class);
                break;
            case R.id.tween_animation_button:
                intent.setClass(this,TweenAnimationActivity.class);
                break;
            case R.id.property_animation_button:
                intent.setClass(this,ProptertyAnimationActivity.class);
                break;
        }

        startActivity(intent);
    }
}
