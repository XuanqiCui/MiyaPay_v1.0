package com.example.miyapay_v10;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;
    private FrameLayout home_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_navigation);
        navigationView = (BottomNavigationView) findViewById(R.id.nav_bottom);
        navigationView.setOnNavigationItemSelectedListener(this);
        navigationView.setSelectedItemId(R.id.menu_rmb2jpy);
        home_fragment = (FrameLayout) findViewById(R.id.home_fragment);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (item.getItemId()) {
            case R.id.menu_home:
                fragmentTransaction.replace(R.id.home_fragment, new HomeFragment()).commit();
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_jpy2rmb:
                fragmentTransaction.replace(R.id.home_fragment, new Jpy2RmbFragment()).commit();
                Toast.makeText(this, "Home2", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.menu_rmb2jpy:
                fragmentTransaction.replace(R.id.home_fragment, new Rmb2JpyFragment()).commit();
                Toast.makeText(this, "Home3", Toast.LENGTH_SHORT).show();

                return true;
        }
        return true;
    }
}