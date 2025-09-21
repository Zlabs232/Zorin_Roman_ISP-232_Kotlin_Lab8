package characters

import world.Quest
import world.QuestType

fun main(){
//    val hero1 = Hero(name = "Artur", hp = 100)
//    println("Герой жив? ${hero1.isAlive()}")
//    val hero2 = Hero(name = "Artur", hp = 0)
//    println("Герой жив? ${hero2.isAlive()}")
//
//    val enemy : GameCharacter = Enemy("Джин")
//    val hero : GameCharacter = Hero("Наруто")
//    val npc : GameCharacter = NPC("Торговец")
//
//    (enemy as Enemy).takeDamage(30)
//    enemy.takeDamage(30)
//    println(enemy.name)

    val trader = Trader(name = "Ральф")

    trader.addQuest(Quest(title = "Собрать травы", duration = 2,
        reward = 50, difficulty = "Лёгкий", questType = QuestType.DELIVERY))
    trader.addQuest(Quest(title = "Убить волков", duration = 3,
        reward = 100, difficulty = "Средний", questType = QuestType.ELIMINATION))

    trader.showAvailableQuests()

    val selectedQuest = trader.giveQuest(index = 1)
    selectedQuest.describe()

}