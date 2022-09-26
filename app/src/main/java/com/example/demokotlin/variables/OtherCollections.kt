package com.example.demokotlin.variables

fun main(args:Array<String>) {

    var map = hashMapOf(1 to "Praveen", 2 to "Pankaj")
    map.put(3, "Himanshu")

    println(map.get(3))

    println(map[3])


    var arr = arrayOf(10, 20, 30)
    println(arr[0])

    var ls = listOf(2, 3, 4, 9) // in this list we can not change value
    for (item in ls) {
        println(item)
    }

    // for change value we have mutable list

    var list = mutableListOf(5, 8, 10, 50)
    list[2] = 12 // in this mutable list we can change value
    for (item in list) {
        println(item)
    }

    var setData = setOf(11, 22, 33, 44)
    for (element in setData) {
        println(element)
    }

    var setData2 = mutableSetOf(12, 21, 23, 32)
    setData2.add(110)

    for (element in setData2) {
        println(element)
    }


}