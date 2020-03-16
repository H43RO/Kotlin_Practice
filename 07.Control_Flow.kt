package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10


    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    if (a > b) {
        println("a가 b보다 크다")
    }

    if(a>b){
        println("a가 b보다 크다")

    }else if(a<b){
        println("a가 b보다 작다")

    }else if(a==b) {
        println("a와 b는 같")
    }else{

    }

    //값을 리턴하는 if문
    val max = if(a > b){
        a //5
    }else{
        b //10
    }

    //간소화할 수도 있다!
    // val max = if(a>b) a else b

    println(max)
}