package com.example.miyapay_v10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RmbCount extends AppCompatActivity {

    private EditText et_rmb_jpy;
    private EditText et_rmb_rmb;
    private Button et_rmb_count;
    private Button btn_rmb_alipay;
    private Button btn_rmb_wechat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rmb_count);

        initView();
    }

    private void initView() {

        et_rmb_jpy = (EditText) findViewById(R.id.et_rmb_jpy);
        et_rmb_rmb = (EditText) findViewById(R.id.et_rmb_rmb);
        et_rmb_count = (Button) findViewById(R.id.btn_rmb_count);
        btn_rmb_alipay = (Button) findViewById(R.id.btn_rmb_alipay);
        btn_rmb_wechat = (Button) findViewById(R.id.btn_rmb_wechat);


    }

    public void rmbCount(View view) {

        String jpy = et_rmb_jpy.getText().toString().trim();

        if (jpy.isEmpty()) {
            Toast.makeText(this,"please input jpy",Toast.LENGTH_SHORT).show();
        }
        else {
            float jpyfloat = Float.parseFloat(jpy);
            float rmbfloat = jpyfloat / 20;
            String rmb = String.valueOf(rmbfloat);
            et_rmb_rmb.setText(rmb);
        }
    }

    public void rmbAlipay(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.eg.android.AlipayGphone","com.alipay.mobile.quinox.splash.ShareDispenseActivity" );
        startActivity(intent);
    }

    public void rmbWechat(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.tencent.mm","com.tencent.mm.ui.LauncherUI");
        startActivity(intent);
    }
}