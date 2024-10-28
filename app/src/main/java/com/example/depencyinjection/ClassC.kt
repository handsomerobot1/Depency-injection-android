package com.example.depencyinjection

import android.util.Log

class ClassC {
//    private val ClassA = ClassA()
//    private val ClassB = ClassB()
    lateinit var ClassA: ClassA
    lateinit var ClassB: ClassB
    fun startClassC() {
        ClassA.startClassA()
        ClassB.startClassB()

        Log.i("TAG", "ClassC is Created")
    }
}