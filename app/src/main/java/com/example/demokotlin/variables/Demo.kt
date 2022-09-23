package com.example.demokotlin.variables

/** This is how we define main function in Kotlin */
fun main(args:Array<String>) {

    /** the difrence between var and val is
     * var ----> if we assign the value is var we can change the value --> we can change the value in runtime
     * val ----> this is the static method in kotlin --> we can not change the value in val ---> its like static method*/

    var name = "Praveen"
    var age = 25
    var percentage = 25.5f
    var percentage1 = 4928293820232L
    var department:String? // in this line means we can assign value for this string after
    department = "Engineering"
    println(name + " Sundriyal" + "\n" +age + "\n" + percentage + "\n" + percentage1)
    println("$name Sundriyal\n$age\n$percentage\n$percentage1") // we can also do this
}