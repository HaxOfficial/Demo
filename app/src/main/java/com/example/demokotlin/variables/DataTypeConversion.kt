package com.example.demokotlin.variables

fun main(args:Array<String>) {

    var a:Int = 10
    var b:Int?
    var c:String = "20"
    b = c.toInt()
    println("print a : $a")
    println("print b : $b")
}