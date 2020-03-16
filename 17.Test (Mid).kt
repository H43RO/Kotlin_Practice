package com.haerokim.myapplication.Kotlin

fun score(score : Int) : Char{ //학점 반환 함수
    when (score){ //조건은 항상 위에서 아래로
        in 90..100 -> return 'A'
        in 80..89 -> return 'B'
        in 70..79 -> return 'C'
        else -> return 'F'
    }
}

fun plusNumber(number:Int):Int{ //입력받은 두자리 숫자에 대해 각 자리 더해서 리턴
    var result = 0
    result += number/10
    result += number%10

    return result
}

fun printGugudan(){ //구구단 출력
    for(i in 1..9){
        for(j in 1..9){
            println( "$i X $j = ${i*j}")
        }
    }
}

fun main(args: Array<String>){

    //#1 리스트에 1부터 9까지 추가하고, 해당 리스트에 대해서 짝수면 true 홀수면 false 추가하는 리스트 생성

    var a = mutableListOf<Int>()

    for(i in 0..8){
        a.add(i+1)
    }

    println(a)

    var b = mutableListOf<Boolean>()

    for(item in a){
        if(item % 2 == 0){
            b.add(true)
        }else{
            b.add(false)
        }
    }

    println(b)


    //#2

    var result = score(90)
    println(result)


    //#3
    println(plusNumber(52))


    //#4
    printGugudan()
}