package com.example.miyapay_v10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_company_logo;
    private TextView tv_company_name;
    private TextView tv_welcome;
    private TextView tv_paymethod;
    private Button btn_rmb;
    private Button btn_jpy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        initView();

    }

    private void initView() {
        iv_company_logo = (ImageView) findViewById(R.id.iv_company_logo);
        tv_company_name = (TextView) findViewById(R.id.tv_company_name);
        tv_welcome = (TextView) findViewById(R.id.tv_welcome);
        tv_paymethod = (TextView) findViewById(R.id.tv_paymethod);

        btn_rmb = (Button) findViewById(R.id.btn_rmb);
        btn_jpy = (Button) findViewById(R.id.btn_jpy);

    }

    public void rmbClick(View view) {

        Intent intent = new Intent(MainActivity.this, RmbCount.class);
        startActivity(intent);

    }

    public void jpyClick(View view) {

        Intent intent = new Intent(MainActivity.this, JpyCount.class);
        startActivity(intent);
    }


}