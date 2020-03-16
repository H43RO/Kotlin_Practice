package com.haerokim.myapplication.Kotlin

fun main(array: Array<String>) {

    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a) //11
    println(b) //9
    println(c) //9
    println(d) //6
    println(e) //2

    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2

    println()
    println(a) //21
    println(b) //-1
    println(c) //27
    println(d) //1
    println(e) //0

    a++
    b--

    println()
    println(a) //22
    println(b) //-2

    var g = a > b
    var h = a == b
    var i = !h
    val l  = i != h
    println()
    println(g) //true
    println(h) //false
    println(i) //true
    println(l) // true

    var j = h && i
    var k = h || i

    println(j) //false
    println(k) //true
}