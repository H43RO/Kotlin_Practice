package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    when (value2) {
        true -> println("")
        false -> println("")
        else -> println("")
    }

    val value3 = when (value2) {
        true -> 1
        false -> 3
        else -> 4
    }

    val value4: Int = 10
    when (value4) {
        is Int -> {
            println("value4 is Int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    val value5: Int = 87
    when (value5) {
        //범위 지정 가능
        in 60..70 -> {
            println("value is 60~70")
        }
        in 70..80 -> {
            println("value is 70~80")
        }
        in 80..90 -> {
            println("value is 80~90")

        }
    }
}
