package com.example.test.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TestDao {
    private val testList = mutableListOf<dulieu>()
    private val test = MutableLiveData<List<dulieu>>()
    init {
        test.value = testList
    }
    fun addTest(_test : dulieu) {
        testList.add(_test)
        test.value = testList
    }
    fun getTest() = test as LiveData<List<dulieu>>
}