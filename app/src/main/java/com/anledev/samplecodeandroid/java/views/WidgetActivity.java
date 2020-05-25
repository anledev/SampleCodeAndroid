package com.anledev.samplecodeandroid.java.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anledev.samplecodeandroid.R;
import com.anledev.samplecodeandroid.java.widgets.DateDialog;

public class WidgetActivity extends AppCompatActivity {
    private static final String TAG = "WidgetActivity";

    public static void show(Context context) {
        Intent intent = new Intent(context, WidgetActivity.class);
        context.startActivity(intent);
    }

    private TextView mTextTime;
    private DateDialog mDateDialog = DateDialog.getInstance(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_widget);
        mTextTime = findViewById(R.id.textTime);
        mDateDialog.setupClickWithView(mTextTime);

    }
}
