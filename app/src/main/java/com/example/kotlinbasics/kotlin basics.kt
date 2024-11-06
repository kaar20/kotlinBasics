package com.example.kotlinbasics

 fun main() {
//    println("Hello Kaar") printing
//     val and var   ==> val is a constant while var is mutable
//     val pi = 3.14
//     var name = "Mohamed Abdiaziz"
//     var age: Int = 12
//     ==> specific data type
//     println("$pi" + "and "+ age)
// Unsigned
//     var num: UShort = 199u
// Boolean
//var myTrue: Boolean = true
//var myFalse: Boolean = false
//     println(myTrue || myFalse)
//     println(myTrue && myFalse)
//     println(!myTrue)

     val age: Int
     println("Enter Your Exact Age")
     age = readln().toInt()


     if (age > 15) {
         println("You are Mature go to the Mosque")
     }
     else {
        println("Make the Dishes for your Parents and Memorize the Quran")

     }

 }