package com.haerokim.myapplication.Kotlin

//두 번까지는 봐준다, 두 번 이상이 넘거가면 리팩토링하자 -> 상속 (부모로부터 설명서를 물려받음)

fun main(args: Array<String>) {
    val superCar100 : SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    val bus100:Bus100 = Bus100()
    bus100.drive()

}

open class Car100() { //기본이 private이기 때문에 open을 통해 공개해야 상속을 할 수 있음
    open fun drive(): String { //기본이 private이기 때문에 open을 통해 공개해야 오버라이딩 할 수 있음
        return "달린다"
    }

    fun stop() {

    }

}

class SuperCar100() : Car100() {
    override fun drive():String { //cmd+N 눌러서 Override Method
        val run = super.drive()
        return "빨리 $run"
    }

}

class Bus100() : Car100() {
}