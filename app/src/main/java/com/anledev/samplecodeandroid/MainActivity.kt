package com.anledev.samplecodeandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anledev.samplecodeandroid.java.JavaMainActivity
import com.anledev.samplecodeandroid.kotlin.KotlinMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnJava.setOnClickListener {
            JavaMainActivity.show(this)
        }
        btnKotlin.setOnClickListener {
            KotlinMainActivity.show(this)
        }
    }
}