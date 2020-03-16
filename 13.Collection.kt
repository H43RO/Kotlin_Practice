package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {


    //==================Immutable Collection================== 변경 불가능 콜렉션

    //List - 중복 개념 있
    var numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList) //1,2,3,3 (동일 값 허용 함 - 중복 O)
    println(numberList.get(3)) //3

    //Set - 순서, 중복 개념 없음음 (get 안됨)
    val numberSet = setOf<Int>(1, 2, 3, 3)
    println(numberSet) //1,2,3 (동일 값 허용 안함 - 중복 X)

    println()
    numberSet.forEach {
        //안에 있는 원소 모두 출력
        println(it) //1,2,3
    }

    //Map - Key, value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one")) //Key 값으로 탐색 , Expect : 1


    //==================Mutable Collection================== 변경 가능 콜렉션

    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4) //왼쪽 인자에 입력된 인덱스에 오른쪽 인자에 입력된 원소 추가
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10) //인덱스가 없으므로 추가할 원소만 기재
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)


}