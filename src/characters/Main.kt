package characters

import magic.Spell

fun main() {
    val naruto = Hero(
        name = "Наруто",
        gender = "мужской",
        role = "Шиноби",
        hp = 150,
        mp = 200,
        level = 5,
        element = "Ветер"
    )
    naruto.showStats()

    val kakashi = Hero(
        name = "Какаши",
        gender = "мужской",
        role = "Шиноби",
        hp = 250,
        mp = 300,
        level = 15,
        element = "Молния"
    )
    kakashi.showStats()

    val orochimaru = Enemy(
        name = "Орочинару",
        hp = 350,
        element = "Ветер"
    )

    naruto.castSpellOn(enemy = orochimaru, spellName = "Расенган", damage = 30)
    naruto.duel(opponent = kakashi)


    val enemy1 = Enemy("Дракон", 150, "Огонь")
    val enemy2 = Enemy("Гоблин", 80, "Земля")

    println("${enemy1.name} сильный: ${enemy1.isStrong()}")
    println("${enemy2.name} сильный: ${enemy2.isStrong()}")

    val enemy3 = Enemy("Дракон", 200, "Огонь")
    val enemy4 = Enemy("Призрак", -10, "Тьма")

    println("${enemy3.name}: уровень угрозы - ${enemy3.getThreatLevel()}")
    println("${enemy4.name}: уровень угрозы - ${enemy4.getThreatLevel()}")

    val smallSpell = Spell("Расенган", 3, "🌀")
    val largeSpell = Spell("Большое заклинание", 6, "🔥")
    val longSpell = Spell("Очень Длинное Заклинание",  2, "⚡")

    println("Наруто может применить ${smallSpell.name}: ${naruto.canCast(smallSpell)}")
    println("Наруто может применить ${largeSpell.name}: ${naruto.canCast(largeSpell)}")
    println("Наруто может применить ${longSpell.name}: ${naruto.canCast(longSpell)}")

    println("${enemy1.name}: сила = ${enemy1.calculatePower()}")
    println("${enemy2.name}: сила = ${enemy2.calculatePower()}")
    println("${enemy3.name}: сила = ${enemy3.calculatePower()}")

    val npc = NPC("Торговец", 100, "Нейтральный", "Гильдия торговцев", true)
    println("NPC: ${npc.name}, Фракция: ${npc.faction}")
    npc.giveQuest()
    npc.trade()

    val boss = Boss("Дракон", 500, "Огонь", 3, true, 4)
    println("\nBoss: ${boss.name}, Фазы: ${boss.phaseCount}, Финальный: ${boss.isFinalBoss}")
    boss.startPhase()
    boss.takeDamage(50)
    boss.dropLoot()
}