package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복문 (1) 인덱스 사용안하고 값만 사용할 때

    for (item in a) {
        if (item == 5) {
            println("item if five")
        } else {
            println("item is not five")
        }
    }

    //반복문 (2) 인덱스도 사용하고 값도 사용할 때

    for ((index, item) in a.withIndex()) {
        println("index : " + index + ", value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }

    //반복문 (3) 인덱스 사용안하고 값만 사용할 때 (it에 값이 담김) - Lambda

    a.forEach {
        println(it)
    }

    //반복문 (4) 인덱스 사용안하고 값만 사용할 때 (매개변수 커스텀) - Lambda

    a.forEach { item ->
        println(item)
    }

    //반복문 (5) index는 index에, 값은 item에
    a.forEachIndexed { index, item ->
        println("index : " + index + ", value : " + item)
    }

    //반복문 (6)
    println(a.size)
    println()
    //until은 마지막을 포함하지 않는 구문
    //0부터 8까지 이다
    for (i in 0 until a.size) {
        println(a.get(i))
    }
    println()

    //반복문 (7) - 0,2,4,6,8 ... 이런식으로 증가함
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }

    println()

    //반복문 (8)
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a.get(i))
    }

    println()

    //반복문 (9) - 8,6,4,2,0 ... 이런식으로 감소함
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    println()

    //반복문 (10)
    //until 과 다르게 ..은 마지막을 포함함 (until은 10을 포함안했을 것)
    for (i in 0..10) {
        println(i)
    }

    //반복문 (11)

    var b: Int = 0
    var c: Int = 4

    while(b < c){
        b++
        println(b)
    }

    println()

    //반복문 (12)

    b = 0

    do{
        println("Hello")
        b++
    }while(b < c)

}