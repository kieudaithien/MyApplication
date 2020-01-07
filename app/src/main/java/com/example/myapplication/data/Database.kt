package com.example.test.data

class Database private constructor(){
    var testDao = TestDao()
        private set
    companion object{
        @Volatile private var instance : Database? = null
        fun getInstance() =
                instance ?: synchronized(this){
                    instance ?: Database().also { instance = it}
                }
    }
}