package com.oong.as.algorithmsimulator.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.oong.as.algorithmsimulator.R;

public class MainActivity extends AppCompatActivity {

    public native String getStringFromNative();
    static {
        System.loadLibrary("ndktest");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(getApplicationContext(), getStringFromNative(), Toast.LENGTH_SHORT).show();
    }

}
