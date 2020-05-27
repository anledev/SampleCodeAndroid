package com.anledev.samplecodeandroid.java.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.anledev.samplecodeandroid.R;
import com.anledev.samplecodeandroid.kotlin.base.BaseActivity;

public class CombineImageActivity extends BaseActivity {

    public static void show(Context context) {
        Intent intent = new Intent(context, CombineImageActivity.class);
        context.startActivity(intent);
        //context.finish();
    }

    private ImageView ivImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_combine_image);
        ivImage = findViewById(R.id.ivImage);
        Bitmap frame = null, out = null;

        Bitmap urImage = BitmapFactory.decodeResource(getResources(),
                R.drawable.bg_snap);//edit
        frame = BitmapFactory.decodeResource(getResources(),
                R.drawable.frame1);
        out = combineImages(frame, urImage);
        ivImage.setImageBitmap(out);
    }

    public Bitmap combineImages(Bitmap frame, Bitmap image) {

        Bitmap cs = null;
        Bitmap rs = null;

        rs = Bitmap.createScaledBitmap(frame, image.getWidth(),
                image.getHeight(), true);

        cs = Bitmap.createBitmap(rs.getWidth(), rs.getHeight(),
                Bitmap.Config.RGB_565);

        Canvas comboImage = new Canvas(cs);

        comboImage.drawBitmap(image, 0, 0, null);
        comboImage.drawBitmap(rs, 0, 0, null);

        if (rs != null) {
            rs.recycle();
            rs = null;
        }
        Runtime.getRuntime().gc();

        return cs;
    }
}
