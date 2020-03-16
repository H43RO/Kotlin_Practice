package com.haerokim.myapplication.Kotlin

fun main(array: Array<String>) {
    val monster = SuperMonster(100,10)
    val night = SuperNight(130,8)
    monster.attack(night)
    monster.bite(night)

}

//상속이 만들어 낸 특징 - 자식클래스는 부모클래스의 타입이다 (거꾸로는 성립 안됨)

open class Character(var hp:Int, var power:Int){

    fun attack(character: Character, power:Int = this.power){
        character.defense(power)
    }

    open fun defense(damage: Int){
        hp -= damage
        if(hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")
        else println("죽었습니다")
    }
}

//자식이 인스턴스화 되기 위해서는 부모 클래스가 선행해서 인스턴스화되어야 함
//부모 클래스에서 사용된 멤버 변수는 val,var 등에 대해 명시하지 않아야하고, 새로운 멤버에 대해 선언 필요
class SuperMonster(hp: Int, power: Int ) : Character(hp, power) {
    fun bite(character: Character){
        super.attack(character, power+2)
    }
}

class SuperNight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower = 2
    override fun defense(damage:Int){
        super.defense(damage-defensePower)
    }
}