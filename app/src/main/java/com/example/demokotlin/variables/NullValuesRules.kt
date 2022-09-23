package com.example.demokotlin.variables

fun main(args:Array<String> ) {
    var name:String?   // if we remove ? so we can not assign null and if we provide ? then we can assign null
    name = "Praveen"
    println(name!!)  // !! this is non null assertion
}