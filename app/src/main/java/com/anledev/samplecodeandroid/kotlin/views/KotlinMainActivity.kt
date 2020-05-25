package com.anledev.samplecodeandroid.kotlin.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.anledev.samplecodeandroid.R
import com.anledev.samplecodeandroid.kotlin.base.BaseActivity

class KotlinMainActivity : BaseActivity() {

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