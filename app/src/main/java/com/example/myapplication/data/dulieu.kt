package com.example.test.data

 data class dulieu(val Email:String,
                   val Pass: String) {
     override fun toString():String{
         return "$Email - $Pass"
     }
}