package com.example.test.intilities

import com.example.test.data.Database
import com.example.test.data.Repository
import com.example.test.ui.test.ViewModelFactory

object InjectorUtils {
    fun provideViewModelFactory():ViewModelFactory {
        val repository = Repository.getInstance(Database.getInstance().testDao)
        return ViewModelFactory(repository)
    }
}