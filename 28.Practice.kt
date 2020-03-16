package com.haerokim.myapplication.Kotlin


fun main(args: Array<String>) {
    val student_: Student__ = Student__()
    student_.eat()
    student_.sleep()

}

interface Person__ { //인터페이스도 구현이 있는 함수를 만들 수 있다
    //구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서, 오버라이드 할 필요도 사라짐
    fun eat(){
        println("먹는다")
    }

    fun sleep(){
        println("잔다")
    }

    abstract fun study() //반드시 구현해야하는 메소드
}

//니가 eat과 sleep을 구하면하면 너도 Person_ 타입이 된다

class Student__ : Person__ {
    override fun study() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Teacher__ : Person__{
    override fun study() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}