package com.example.test.data

class Repository private constructor(private val testDao: TestDao){
    fun addTest(test : dulieu)
    {
        testDao.addTest(test);
    }
    fun getTest() = testDao.getTest()
    companion object{
        @Volatile private var instance : Repository? = null
        fun getInstance(testDao: TestDao) =
            instance ?: synchronized(this){
                instance ?: Repository(testDao).also { instance = it}
            }
    }
}