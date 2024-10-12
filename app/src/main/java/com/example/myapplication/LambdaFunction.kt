package com.example.myapplication

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    uppercaseString("helo")
    println({ string: String -> string.uppercase()}("hello"))
}