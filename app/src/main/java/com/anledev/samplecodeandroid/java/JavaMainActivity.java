package com.anledev.samplecodeandroid.java;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anledev.samplecodeandroid.R;

public class JavaMainActivity extends AppCompatActivity {

    public static void showClose(Context context) {
        Intent intent = new Intent(context, JavaMainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
    }
}
