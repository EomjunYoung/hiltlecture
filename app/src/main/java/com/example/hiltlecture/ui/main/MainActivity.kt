package com.example.hiltlecture.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltlecture.R
import dagger.hilt.android.AndroidEntryPoint

//hilt로부터 의존성 주입을 받는 대상이 되는 객체가 있는 곳에 기입하는 어노테이션
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}