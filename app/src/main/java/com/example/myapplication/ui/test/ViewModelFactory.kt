package com.example.test.ui.test

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.test.data.Repository

class ViewModelFactory(private val repository: Repository): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TestViewModel(repository) as T
    }
}