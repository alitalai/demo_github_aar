package com.example.demo_sdk

import com.example.demo_sdk.add.Add
import com.example.demo_sdk.subs.Subs

class mainClass {

    val addClass = Add()
    val subsClass = Subs()

    fun doAddThenSub(n1:Int,n2:Int):Int{
        val n3:Int = n1+n2

        return n3-n1
    }

}