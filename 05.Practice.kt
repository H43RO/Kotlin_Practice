package com.haerokim.myapplication.Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    val result = first + second + third
    return result
}

//간소화된 함수 선언
fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree1(first: Int, second: Int, third: Int): Int {
    return first * second * third
}

//기본 인자를 갖고 있는 함
fun multiplyThree2(first: Int = 3, second: Int = 3, third: Int = 3): Int {
    return first * second * third
}

//내부 함수 - 함수 안에 함수가 있음
fun showMyPlus(first: Int, second: Int): Int {

    //return first + second 기능을 대체하
    //내부 함수를 사용해보면
    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    return plus(first, second)
}

fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3) //6
    println(result)

    val result1 = minusThree(10, 2, 3) //5
    println(result1)

    val result2 = multiplyThree1(2, 2, 2) //8
    println(result2)

    val result3 = multiplyThree2() //27
    println(result3)

    val result4 = showMyPlus(3,4)//7
    println(result4)

}