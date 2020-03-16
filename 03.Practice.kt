package com.haerokim.myapplication.Kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

//var abc : Int = null
var abc: Int? = null //물음표 붙이면 null 가질 수 있는 자료형

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc)
}

