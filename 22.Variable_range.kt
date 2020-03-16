package com.haerokim.myapplication.Kotlin

var number100 :Int = 10

fun main(args:Array<String>){
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)

}

class Test(var name:String){

    fun testFun(){
        var birth: String = "19990922"
        name = "홍길동"
        number100 = 100
        fun testFun2(){
            var gender:String = "Male"
        }
        //gender -> Scope Error
    }

    fun testFun2(){
        //birth -> Scope Error
    }
}