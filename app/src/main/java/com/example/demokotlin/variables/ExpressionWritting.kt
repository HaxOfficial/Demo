package com.example.demokotlin.variables

fun main(args:Array<String>) {

    /*
    * This is the expression of writing
    * we can simplify to write code like this
    * */

    var a = 10
    var b = 20
    var max = if (a>b) a else b

    println("max value is :  $max")

    var age = 30
    var myAge = when(age) {
        30 -> true
        else -> false
    }

    println("my age is : $myAge")
}