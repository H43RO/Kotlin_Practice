package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val value: Int = 3
    when (value) {

        //중괄호 생략해도됨
        1 -> {
            println("Value is 1")
        }
        2 -> {
            println("Value is 2")
        }
        3 -> {
            println("Value is 3")
        }
        else->{
            println("I don't know value")
        }
    }

    val value2 = when(value){
        1->10
        2->20
        3->30
        else->100
    }

    println(value2) //30
}