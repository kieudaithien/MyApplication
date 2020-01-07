package com.example.test.ui.test

import androidx.lifecycle.ViewModel
import com.example.test.data.Repository
import com.example.test.data.dulieu

class TestViewModel(private val repository: Repository): ViewModel(){
    fun getTest() = repository.getTest();
    fun addQuote(test : dulieu) = repository.addTest(test)
}