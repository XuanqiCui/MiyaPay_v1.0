package com.example.miyapay_v10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends Activity {


    private ImageView iv_splash_img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();

        //handler处理 UI线程和后台线程之间的通信
        new Handler().postDelayed(new Runnable() {
            @Override
            //runnable()是个接口，实现了这个接口
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        },2000);
    }

    private void initView() {
        iv_splash_img = (ImageView) findViewById(R.id.iv_splash_img);
    }


}