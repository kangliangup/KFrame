package com.k.kframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.k.kutils.EmptyUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EmptyUtils.isEmpty("1");

    }
}
