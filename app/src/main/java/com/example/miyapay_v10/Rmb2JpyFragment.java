package com.example.miyapay_v10;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Rmb2JpyFragment extends Fragment {

    private View tv_rmb2jpy;
    private EditText et_jpy_jpy;
    private EditText et_jpy_rmb;
    private Button btn_jpy_count;
    private Button btn_jpy_alipay;
    private Button btn_jpy_wechat;

    public Rmb2JpyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_rmb2_jpy, container, false);
        initView(view);
        return view;

    }

    public void jpyCount(View view) {

        String rmb = et_jpy_rmb.getText().toString().trim();

        if (rmb.isEmpty()) {
            //Toast.makeText(this,"please input rmb",Toast.LENGTH_SHORT).show();
        }
        else {
            float rmbfloat = Float.parseFloat(rmb);
            float jpyfloat = rmbfloat / 20;
            String jpy= String.valueOf(rmbfloat);
            et_jpy_jpy.setText(rmb);
        }

    }

    private void initView(View view) {
        et_jpy_jpy = (EditText)view.findViewById(R.id.et_jpy_jpy);
        et_jpy_rmb = (EditText)view.findViewById(R.id.et_jpy_rmb);
        btn_jpy_count = (Button)view.findViewById(R.id.btn_jpy_count);
        btn_jpy_alipay = (Button)view.findViewById(R.id.btn_jpy_alipay);
        btn_jpy_wechat = (Button)view.findViewById(R.id.btn_jpy_wechat);
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