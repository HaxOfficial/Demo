package com.example.demokotlin.variables
/*
* Priority in Integers -------->
* 1 --> ()  Bracts
* 2 --> ^ Power
* 3 --> * / multiply and Divide
* 4 --> + - plus and minus
* In Kotlin We use BOARDMASS rule
* */

fun main(args:Array<String>) {
    var a:Int = 10
    var b:Int = 20
    var c:Int = 30
    var sum:Int?
    sum = a+b*c-10
    println("This is sum : $sum")
}