package com.haerokim.myapplication.Kotlin

fun main(args:Array<String>){
    val array = arrayOf<Int>(1,2,3)

    var number = array.get(0)
    println(number)

    array.set(0, 100) //0번째 인덱스에 100을 넣겠다
    val number2 = array.get(0)
    println(number2)

    //타입 명시 배열의 정석
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b', 'c')
    val a3 = doubleArrayOf(3.5,100.34)
    val a4 = booleanArrayOf(true,false,true)

    //Lambda를 활용한 배열 생성법
    var a5 = Array(10,{0}) //처음부터 끝까지 0으로 채움
    var a6 = Array(5,{1;2;3;4;5})
}