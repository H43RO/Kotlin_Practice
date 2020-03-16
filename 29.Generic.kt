package com.haerokim.myapplication.Kotlin

//Generic (제너릭)

//목적 : 다양한 타입의 객체들을 다루는 메소드나 컬렉션
//      클래스에서 컴파일 시에 타입을 체크해주는 기능
// -> 타입을 체크하는 기능
//제너릭은 만들기 어렵고 실제로 만들일이 거의 없어서 사용법만 숙지한다

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, "가") // 제너릭이 사용되지 않은 경우
    val b: String = list1[2].toString() // 형변환이 필요함 (타입 변환)

    val list2 = listOf<String>("a", "b", "c") // 제너릭이 사용된 경우
    val c: String = list2[2] // 형변환이 필요하지 않음 (명시됨) - String 임을 보장받음 -> 타입이 안전하다

    val list3 = listOf(1, 2, 3, "가", "나", 3.0)
    //val list4 = listOf<Int>(1, 2, 3, "가") 강한 타입 체크 기능

    //제너릭을 사용하지 않은 경우
    val list5 =
        listOf<Any>(1, 2, 3, "가") // -> Any Type (아무거나 타입) - Int, String, Float 등의 타입들의 부모클래스


}