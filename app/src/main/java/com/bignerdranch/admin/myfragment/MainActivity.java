package com.bignerdranch.admin.myfragment;




import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
               OneFragment fragment1 = new OneFragment();
                transaction.replace(R.id.fragment_container,fragment1);
                transaction.commit();
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
      button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                TwoFragment fragment2 =new  TwoFragment();
                transaction.replace(R.id.fragment_container,fragment2);
                transaction.commit();
            }
        });
    }
}

