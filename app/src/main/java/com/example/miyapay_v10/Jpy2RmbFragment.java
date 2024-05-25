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

public class Jpy2RmbFragment extends Fragment {


    private Button btn_rmb_count;
    private EditText et_rmb_jpy;
    private EditText et_rmb_rmb;
    private Button btn_rmb_alipay;
    private Button btn_rmb_wechat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_jpy2_rmb, container, false);
        initView(view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn_rmb_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jpy = et_rmb_jpy.getText().toString().trim();

                if (jpy.isEmpty()){
                    // Toast.makeText(Jpy2RmbFragment.this, "please input jpy", Toast.LENGTH_SHORT).show();
                }
                else {
                    float jpyfloat = Float.parseFloat(jpy);
                    float rmbfloat = jpyfloat / 20;
                    String rmb = String.valueOf(rmbfloat);
                    et_rmb_rmb.setText(rmb);
                }
            }
        });

        btn_rmb_alipay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClassName("com.eg.android.AlipayGphone","com.alipay.mobile.quinox.splash.ShareDispenseActivity" );
                startActivity(intent);
            }
        });

        btn_rmb_wechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName("com.tencent.mm","com.tencent.mm.ui.LauncherUI");
                startActivity(intent);
            }
        });


    }

    private void initView(View view) {
        btn_rmb_count = (Button) view.findViewById(R.id.btn_rmb_count);
        et_rmb_jpy = (EditText)view.findViewById(R.id.et_rmb_jpy);
        et_rmb_rmb = (EditText) view.findViewById(R.id.et_rmb_rmb);
        btn_rmb_alipay = (Button) view.findViewById(R.id.btn_rmb_alipay);
        btn_rmb_wechat = (Button) view.findViewById(R.id.btn_rmb_wechat);
    }
//
//    public void rmbAlipay(View view) {
//        Intent intent = new Intent();
//        intent.setClassName("com.eg.android.AlipayGphone","com.alipay.mobile.quinox.splash.ShareDispenseActivity" );
//        startActivity(intent);
//    }
//
//    public void rmbWechat(View view) {
//        Intent intent = new Intent();
//        intent.setClassName("com.tencent.mm","com.tencent.mm.ui.LauncherUI");
//        startActivity(intent);
//    }
}