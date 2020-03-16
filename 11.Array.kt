package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {

    //타입 명시 (변수 선언처럼 해당 타입의 원소만 포함 가능)
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    println(group1.get(1)) //2
    println(group1.get(4)) //5

    println(group1[2]) //3
    println(group1[3]) //4

    //타입 비명시 (여러 타입의 원소 포함 가능)
    var group2 = arrayOf(1,2,3.5,"Hello")

}