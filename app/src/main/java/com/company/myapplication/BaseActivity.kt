package com.company.myapplication

import android.util.Log
import androidx.appcompat.app.AppCompatActivity


//abstract = 추상클래스 하기위한 명령어
abstract class BaseActivity : AppCompatActivity() {
    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("log", "onBackPressed()")
    }
}