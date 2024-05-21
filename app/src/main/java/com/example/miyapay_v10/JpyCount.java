package com.example.miyapay_v10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JpyCount extends AppCompatActivity {

    private EditText et_jpy_jpy;
    private EditText et_jpy_rmb;
    private Button btn_jpy_count;
    private Button btn_jpy_alipay;
    private Button btn_jpy_wechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jpy_count);


        initView();
    }

    private void initView() {
        et_jpy_jpy = (EditText) findViewById(R.id.et_jpy_jpy);
        et_jpy_rmb = (EditText) findViewById(R.id.et_jpy_rmb);
        btn_jpy_count = (Button) findViewById(R.id.btn_jpy_count);
        btn_jpy_alipay = (Button) findViewById(R.id.btn_jpy_alipay);
        btn_jpy_wechat = (Button) findViewById(R.id.btn_jpy_wechat);

    }

    public void jpyCount(View view) {

        String rmb = et_jpy_rmb.getText().toString().trim();

        if (rmb.isEmpty()) {
            Toast.makeText(this,"please input rmb",Toast.LENGTH_SHORT).show();
        }
        else {
            float rmbfloat = Float.parseFloat(rmb);
            float jpyfloat = rmbfloat / 20;
            String jpy= String.valueOf(rmbfloat);
            et_jpy_jpy.setText(rmb);
        }

    }

    public void jpyAlipay(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.eg.android.AlipayGphone","com.alipay.mobile.quinox.splash.ShareDispenseActivity" );
        startActivity(intent);
    }

    public void jpyWechat(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.tencent.mm","com.tencent.mm.ui.LauncherUI");
        startActivity(intent);
    }
}