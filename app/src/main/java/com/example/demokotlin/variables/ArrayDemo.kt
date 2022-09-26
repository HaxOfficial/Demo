package com.example.demokotlin.variables

fun main(args:Array<String>) {

    var arrayInt = Array<Int>(5){0}
    arrayInt[3] = 10
    arrayInt[1] = 5
    println("Print array of 3 : " + arrayInt[3] + " \nPrint Array of 1 is : " + arrayInt[1])

    println("All Elements by using object")

    for (a in arrayInt) {
        println(a)
    }

    println("All elements by using index")

    for (index in 0..4) {
        println(arrayInt[index])
    }

    var arrstr = Array<String>(4){""}

    for (index in 0..3) {
        print("aarstr[ $index ] = ")
        arrstr[index] = readLine()!!
    }

    for (index in 0..3) {
        println("arrstr[$index]= " + arrstr[index])
    }
}