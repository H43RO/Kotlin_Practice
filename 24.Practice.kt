package com.haerokim.myapplication.Kotlin

fun main(args:Array<String>){
    val night = Night(20,4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)

}

class Night(private var hp : Int, private var power : Int){ //속성 외부 변경 방지
    fun attack(monster:Monster){
        monster.defense(power)
    }

    fun defense(damage:Int){
        hp -= damage
        if(hp > 0){
            heal()
            println("기사 현재 체력은 $hp 입니다")
        }
        else println("기사가 죽었습니다!")
    }

    private fun heal(){ //메소드 외부 호출 금지
        hp += 3
    }
}

class Monster(private var hp: Int, private var power :Int){
    fun attack(night:Night){
        night.defense(power)
    }

    fun defense(damage:Int){
        hp -= damage
        if(hp > 0) println("몬스터 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다!")
    }
}

