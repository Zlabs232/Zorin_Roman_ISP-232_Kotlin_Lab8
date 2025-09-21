package world

fun main() {
//    val contract1 = Contract(
//        "Охота на гоблинов",
//        "Чухан Элрик",
//        "Охотиться на гоблинов в лесу",
//        500,
//        true
//    )
//
//    val contract2 = Contract(
//        "Доставка товара",
//        "Мопс Альберт",
//        "Доставить товар в соседний город",
//        300
//    )
//
//    contract1.printContractInfo()
//    println()
//    contract2.printContractInfo()

    val missions = listOf(
//        Quest("Охота на монстров", 5, 600, "Средний"),
        SpecialOperation("Ночной рейд", 1500, 2, true),
        Contract("Доставка груза", "Гильдия Торговцев", "Доставить груз через лес", 800, true)
    )

    for (mission in missions) {
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }
}