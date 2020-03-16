package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {

    //1번 문제
    val cal: Calculator = Calculator()
    println(cal.multiply(3, 5))

    val cal2 : Calculator2 = Calculator2()
    println(cal2.plus(1,2,3,4))

    val cal3 : Calculator3 = Calculator3(3)
    //Return Type 을 객체로 할 시, 다음과 같은 구현이 가능함 (진짜 계산기 처럼 기능을 이어나감)
    println(cal3.plus(5).minus(5).initialValue)
    //-> Chaining 체이닝 기법

    println()

    //2번 문제
    val account: MakeAccount = MakeAccount("Kim", "19990922")
    account.showBalance()
    account.save(500000)
    account.withdraw(300000)

    //3번 문제
}

class Calculator {
    fun add(first: Int, second: Int): Int {
        return first + second
    }

    fun minus(first: Int, second: Int): Int {
        return first - second
    }

    fun multiply(first: Int, second: Int): Int {
        return first * second
    }

    fun divide(first: Int, second: Int): Int {
        return first / second
    }
}

class Calculator2 { //많은 인자들에 대한 사칙연산 계산
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = 0
        for (i in 0 until numbers.size) {
            result -= i
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result *= it
            }
        }

        return result

    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result /= value
            }
        }
        return result
    }
}

class Calculator3(val initialValue:Int){
    fun plus(number:Int):Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number:Int):Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number:Int):Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number:Int):Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }
}

class MakeAccount {
    var name: String
    var birthDate: String
    var balance: Int

    constructor(name: String, birthDate: String) {
        this.name = name
        this.birthDate = birthDate
    }

    init {
        balance = 0
    }

    fun showBalance() {
        println("현재 잔고는 ${this.balance}원 입니다")
    }

    fun save(money: Int) {
        balance += money
        showBalance()
    }

    fun withdraw(money: Int) {
        balance -= money
        showBalance()
    }
}
