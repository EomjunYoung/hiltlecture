package com.example.hiltlecture.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.hiltlecture.data.MyRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: MyRepository): ViewModel() {


    fun getRepositoryHash() = repository.toString()

}