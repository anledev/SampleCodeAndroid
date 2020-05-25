package com.anledev.samplecodeandroid.kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anledev.samplecodeandroid.R

class KotlinMainActivity : AppCompatActivity() {

    companion object {
        fun show(context: Context) {
            val intent = Intent(context, KotlinMainActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)
    }
}