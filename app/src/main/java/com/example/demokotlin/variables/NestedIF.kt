package com.example.demokotlin.variables

fun main(args:Array<String>) {

    /**
     * This is nested if in kotlin*/

//    var grade = 84
//
//    if (grade>80) {
//        if (grade>=90 && grade<=100)
//            print("Grade is A+")
//        else {
//            print("Grade is A-")
//        }
//    }

    /**
     * We Are using when in here
     * */

    print("Enter the Number : ")
    var num = readLine()!!.toInt()
    when(num) {
        1, 3, 5, 7 -> {
            print("Value 1 and 3 and 5 and 7")
        }
        in 10..30 -> {
            print("Value 10 to 30")
        }
        !in 20..30 -> {
            print("value 20 to 30 not")
        }
        else -> {
            print("Sorry Your choose wrong Number")
        }
    }


}