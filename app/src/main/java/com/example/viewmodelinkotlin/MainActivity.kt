package com.example.viewmodelinkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
var model:MyViewModel? = null
    var txt1:TextView? = null
        var txt2:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          txt1=findViewById<TextView>(R.id.txt1)
        txt2=findViewById<TextView>(R.id.txt2)
         model= ViewModelProviders.of(this).get(MyViewModel::class.java)
        val btn1=findViewById<Button>(R.id.btn1)
        display()
        btn1.setOnClickListener {
            add1()
            display()
        }
        val btn2=findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            add2()
            display()
        }
    }


    fun add1():Unit{

            model?.addA()

    }
    fun add2():Unit{
        model?.addB()
    }
    fun display():Unit{
        txt1?.setText(Integer.toString(model!!.a))
        txt2?.setText(Integer.toString(model!!.b))

    }


}
