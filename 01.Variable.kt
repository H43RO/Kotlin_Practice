package com.haerokim.myapplication.Kotlin

//Variable

//var, var name = data

//var == varible - 내 맘대로 원하는 것을 넣을 수 있음
//value == value - 한번 넣으면 바꿀 수 없는 상자 -> Value

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20


fun main(args: Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)

}