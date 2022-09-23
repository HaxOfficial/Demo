package com.example.demokotlin.variables

fun main(args:Array<String>) {

    println("Enter Your Name : ")
    var name = readLine()

    println("Enter Your age : ")
    var age:Int = readLine()!!.toInt() /** if we want to print integer we have to change into integer and same goes for other data Types*/

    println("Enter Your designation : ")
    var desg = readLine()

    println(name)
    println(age)
    println(desg)
}