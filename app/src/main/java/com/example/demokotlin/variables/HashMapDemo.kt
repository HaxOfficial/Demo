package com.example.demokotlin.variables

fun main(args:Array<String>) {

    // In hashmap sequence doesn't matter
    var map = HashMap<Int, String>()
    map.put(1, "Praveen")
    map.put(2, "Pankaj")
    map.put(30, "Shivam")
    map.put(4, "Anubhav")

    println(map.get(2))

    for (k in map.keys) {
        println(map.get(k))
    }

}