package com.haerokim.myapplication.Kotlin

//Interface
//-생성자가 없음 (인스턴스화 시킬 수 없음) -> 설명서 아님 (지침서의 개념에 가까움)
//특정 Interface을 구현할 시 내용물을 모두 구체화해야함

//상속과 다른점
//-상속은 조상을 찾아가는 느낌
//-인터페이스는 종의 특징

fun main(args: Array<String>) {
    val student_: Student_ = Student_()
    student_.eat()
    student_.sleep()

}

interface Person_ {
    fun eat()
    fun sleep()
}

//니가 eat과 sleep을 구하면하면 너도 Person_ 타입이 된다

class Student_ : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}

class SoccerPlayer : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}