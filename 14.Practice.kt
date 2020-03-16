package com.haerokim.myapplication.Kotlin

fun main(args:Array<String>){
    val a = mutableListOf<Int>(1,2,3)
    a.add(4) //자동으로 맨 뒷자리에 원소 추가
    println(a)

    a.add(0,100)
    println(a) //0번째에 100이 들어가는게 아니라 뒤로 밀리는 것
    //기존에 값이 있으면 기존 값들을 뒤로 한칸씩 밀고 삽입함

    a.set(0,200)
    println(a) //0번째에 200을 넣음 (덮어쓰기)

    a.removeAt(1)
    println(a) //1번째 원소 삭제

    println()

    val b = mutableSetOf<Int>(1,2,3,4)
    b.add(2)
    println(b) //1,2,3,4 (중복 허용 안함)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b) //없는 인덱스여도 오류가 나진 않음

    println()

    val mMap = mutableMapOf<String, Int>("ont" to 1)
    println()
    mMap.put("two", 2) //{one=1, two=2}

    println(mMap)
    mMap.replace("two", 3)

    println(mMap)
    println(mMap.keys)
    println(mMap.values)

    mMap.clear()
    println(mMap)
}