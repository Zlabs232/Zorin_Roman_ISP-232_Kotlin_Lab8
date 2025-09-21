package magic

import magic.Spell

fun main() {
    val fireWall = Spell(
        name = "Огненная Стена",
        width = 5,
        height = 3,
        symbol = "\uD83D\uDD25"
    )
    fireWall.cast()

    val iceShield = Spell(
        name = "Ледяной Щит",
        width = 4,
        height = 4,
        symbol = "❄"
    )
    iceShield.cast()

    val lightning = Spell(
        name = "Молния",
        width = 3,
        height = 6,
        symbol = "\u26A1"
    )
    lightning.cast()

    val waterStrike = Spell(
        name = "Водяной Удар",
        width = 7,
        height = 2,
        symbol = "\uD83C\uDF0A"
    )
    waterStrike.cast()

    val fireball = Spell(name = "Огненный шар", width = 3, height = 3,
        symbol = "\uD83D\uDD25")
    val heal = InstantSpell(name = "Лечение",
        symbol = "\uD83D\uDC9A", power = 5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}