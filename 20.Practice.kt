package com.haerokim.myapplication.Kotlin

fun main(args:Array<String>){
    val account:Account = Account("홍길동","19990922",1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()

    val account2:Account = Account("홍길동","19990922",-5000)
    println(account2.checkBalance())
    println(account2.save(1000))
    println(account2.withdraw(2000))
    println(account2.checkBalance())

    println()

    val account3:Account2 = Account2("루루","19990922")
    println(account3.checkBalance())

}


class Account {
    var name: String
    var birthDate: String
    var balance: Int

    constructor(name: String, birthDate: String, balance:Int) {
        this.name = name
        this.birthDate = birthDate

        //잔액이 0원 이하인 경우를 대응
        if(balance >= 0) this.balance = balance else this.balance = 0
    }

    init {
        balance = 0
    }

    fun checkBalance():Int {
        return balance
    }

    fun save(money: Int) {
        balance += money
    }

    fun withdraw(money: Int) :Boolean{
        if(balance >= money){
            balance-=money
            return true
        }
        else {
            return false
        }
    }
}

class Account2(val name:String, val birth:String, var balance:Int = 1000){


    fun checkBalance():Int {
        return balance
    }

    fun save(money: Int) {
        balance += money
    }

    fun withdraw(money: Int) :Boolean{
        if(balance >= money){
            balance-=money
            return true
        }
        else {
            return false
        }
    }
}

class Account3(initialBalance:Int){

    val balance :Int = if(initialBalance >= 0) initialBalance else 0

    fun checkBalance():Int{
        return balance
    }
}