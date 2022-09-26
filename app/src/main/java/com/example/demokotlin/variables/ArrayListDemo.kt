package com.example.demokotlin.variables

fun main(args:Array<String>) {

    var arrayList = ArrayList<String>()
    arrayList.add("Praveen")
    arrayList.add("Anubhav")
    arrayList.add("Pankaj")
    arrayList.add("Shivam")

    println("Array is : " + arrayList.get(0))

    arrayList.set(2, "Pankaj Tiwari") // this is for set data in index in kotlin

    println("Printing all elements object")

    for (item in arrayList) {
        println(item)
    }

    if (arrayList.contains("Shivam")) {
        println("Name Found")
    } else {
        println("Name not Found !")
    }

    println("Print all elements by index")
    for (index in 0..arrayList.size - 1) {
        println(arrayList.get(index))
    }

}