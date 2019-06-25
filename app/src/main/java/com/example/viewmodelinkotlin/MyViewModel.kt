package com.example.viewmodelinkotlin

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    public var a =0
    public var b=0

    fun addA(): Unit{
        a=a.plus(1)
    }
    fun addB(): Unit{
       b= b.plus(1)
    }

}