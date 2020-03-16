package com.haerokim.myapplication.Kotlin

fun main(args: Array<String>) {
    val tv = TV(listOf<String>("K", "M", "S")) //0,1,2
    tv.switch()
    println(tv.onOrOff)
    println(tv.onOrOff)

    tv.channelUp()
    println(tv.checkCurrentChannel())

    tv.channelUp()
    println(tv.checkCurrentChannel())

    tv.channelUp()
    println(tv.checkCurrentChannel())

    tv.channelUp()
    println(tv.checkCurrentChannel())

    println()

    tv.channelDown()
    println(tv.checkCurrentChannel())

    tv.channelDown()
    println(tv.checkCurrentChannel())

    tv.channelDown()
    println(tv.checkCurrentChannel())

    tv.channelDown()
    println(tv.checkCurrentChannel())

    println()
    println(tv.currentChannelNumber) //get

}

class TV(val channels: List<String>) {
    var onOrOff: Boolean = false //True->On False->Off
    var currentChannelNumber = 0
        set(value) { //값이 설정될 때
            field = value
//            currentChannelNumber = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
        get() { //값이 호출될 때 (직접)
            println("호출되었습니다")
            return field
        }

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber += 1
//        channels.forEachIndexed{index, value->
//            if(currentChannelNumber == index){
//                currentChannelNumber += 1
//                return
//            }
//        }
    }

    fun channelDown() {
        currentChannelNumber -= 1
//        channels.forEachIndexed{index, value->
//            if(currentChannelNumber == index){
//                currentChannelNumber -=1
//                return
//            }
//        }
    }
}