package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val testAccess: TestAccess = TestAccess("루루")
    testAccess.test()
    println(testAccess.getName())

}

class TestAccess {
    private var name: String = "홍길동" //클래스 외부에서의 해당 변수 접근 방지 (private)

    fun getName():String{
        return name
    }

    constructor(name: String) {
        this.name = name
    }

    fun test(){
        println("테스트")
    }
}

class RunningCar(){
    fun runFast(){
        run()
    }

    private fun run(){ //다른 메소드에 사용될 보조 로직이라서, 굳이 공개될 필요가 없을 때 Private 처리를 함

    }
}