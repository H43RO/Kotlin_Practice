package com.haerokim.myapplication.Kotlin

//OOP -> Object Oriented Programming
//객체를 생성해서, 객체에게 일을 할당시켜 문제를 해결
//선수, 심판, 경기장, 관중 -> 축구 게임

//객체를 만드는 방법
// -설명서가 있어야함

fun main(args: Array<String>) {

    //클래스(설명서)를 통해서 실체를 만듦
    //인스턴스 화 -> 인스턴스 (객체) + 우리가 만든 클래스는 자료형이 됨

    val bigCar: Car = Car("v8 engine", "big")
    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    val runableCar:RunableCar = RunableCar("simple engine", "short body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    //인스턴스의 멤버변수에 접근하는 방법

    val runableCar2:RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)


    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)
}

//클래스(객체를 만들기 위한 설명서) 만드는 방법 (1)

class Car(var engine: String, var body: String) {

}

//클래스 만드는 방법 (2) - 생성자 명시

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.door = door
        this.body = body
    }

}

//클래스 만드는 방법(3) - 1번 방법의 확장 (필수적인 멤버 이외에 같이 생성자 사용할 때)
class Car1(engine: String, body: String) { //필수적인 멤버와 함께 클래스 생성
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) { //부가적인 멤버 초기화
        this.door = door
    }
}

//클래스 만든느 방법(4) - 2번 방법의 확장 (다양 생성자)

class Car2 {
    var engine: String
    var body: String
    var door: String =""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String,body: String){ //멤버 변수가 private
    fun ride(){
        println("탑승 하였습니다")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination:String){
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2{ //멤버 변수가 public
    val engine:String
    val body:String

    constructor(engine: String,body: String){
        this.engine=engine
        this.body=body
    }

    init{ //인스턴스화될 때 가장 먼저 호출되는 메소드 (멤버 초기화 할 때 유용함)
        println("RunableCar2가 만들어졌습니다")
    }

    fun ride(){
        println("탑승 하였습니다")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination:String){
        println("$destination 으로 목적지가 설정되었습니다")
    }
}


//오버로딩 - 클래스 내에 같은 이름의 메소드는 존재 불가

class TestClass{

    fun test(a:Int){
        println("Up")
    }

    fun test(a:Int,b:Int){
        println("Down")
    }
}