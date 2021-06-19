package com.example.hiltlecture.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltlecture.R
import com.example.hiltlecture.data.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//hilt로부터 의존성 주입을 받는 대상이 되는 객체가 있는 곳에 기입하는 어노테이션
@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject //hilt로부터 의존성 주입을 시킬 객체에 기입하는 어노테이션
    lateinit var repository: MyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}