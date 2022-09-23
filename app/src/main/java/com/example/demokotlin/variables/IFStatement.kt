package com.example.demokotlin.variables

fun main(args: Array<String>) {

    print("Enter Your Grade : ")
    var grade = readLine()!!.toDouble()

    if (grade >= 90) {
        println("Your Grade is A ")
    } else if (grade >= 80 && grade<90) {
        println("Your Grade is B")
    } else if(grade >= 70 && grade<80) {
        println("Your Grade is C")
    } else {
        println("Your Grade is D")
    }
}