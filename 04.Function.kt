package com.haerokim.myapplication.Kotlin


fun func_name(var1: Int, var2: Int): Int {
    val result = var1 + var2
    return result
}

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

fun plusFive(first: Int, second: Int = 5): Int {
    val result = first + second
    return result
}

fun printPlus(first: Int, second: Int): Unit { //Unit : 아무것도 반환 안하는 리턴 타입 (생략 가능)
    val result = first + second
    println(result)
}

//Simple function declaration

fun plusShort(first: Int, second: Int) = first + second

//Variable argument function

fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    //println(plus(second = 100, first = 50) <- 명시적으로 인자 순서 변경해도 됨
    println(plus(1, 3)) //4
    println(plusFive(10, 20)) //30
    println(plusFive(5)) //10

    println(plusShort(100, 200)) //300

    printPlus(5,6) //11

    plusMany(1, 2, 3, 4) //1,2,3,4
}


