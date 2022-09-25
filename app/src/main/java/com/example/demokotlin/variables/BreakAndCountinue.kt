package com.example.demokotlin.variables

fun main(args:Array<String>) {

//    for (x in 1..5) {
//        if (x==3) {
//            continue
//            println("Praveen")
//        }
//
//        println("The value of x : $x")
//    }

    loop@for (x in 1..5) {

        for (y in 1..5) {
            println("The Value of y : $y")

            if (x==2) {
                break@loop // we can use this to exit all loop and where we assign we can exit the loop
            }
        }

        println("The value of x : $x")
    }
}