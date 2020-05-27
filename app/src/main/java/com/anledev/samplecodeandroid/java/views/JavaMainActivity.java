package com.anledev.samplecodeandroid.java.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.anledev.samplecodeandroid.R;
import com.anledev.samplecodeandroid.java.base.BaseActivity;

public class JavaMainActivity extends BaseActivity {

    public static void show(Context context) {
        Intent intent = new Intent(context, JavaMainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);

    }
}
