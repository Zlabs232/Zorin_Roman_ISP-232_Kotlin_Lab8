package world

fun printOnlyExploreQuests(quests: List<Quest>) {
    println("==КВЕСТЫ ТИПА EXPLORE==")
    val exploreQuests = quests.filter { it.questType == QuestType.EXPLORE }
    if (exploreQuests.isEmpty()) {
        println("Квестов типа EXPLORE не найдено")
    } else {
        exploreQuests.forEach { it.printInfo() }
    }
}

fun main() {
    val quest1 = Quest(
        "Доставка посылки",
        5,
        100,
        "Легкий",
        QuestType.DELIVERY
    )

    val quest2 = Quest(
        "Исследование пещеры",
        10,
        350,
        "Средний",
        QuestType.EXPLORE
    )

    val quest3 = Quest(
        "Охотник на гоблинов",
        8,
        250,
        "Средний",
        QuestType.ELIMINATION
    )

    val allQuests = listOf(quest1, quest2, quest3)

    println("==describe()==")
    allQuests.forEach {
        it.describe()
        println("---")
    }

    println("==printInfo()==")
    allQuests.forEach {
        it.printInfo()
        println("---")
    }

    println("\n")

    printOnlyExploreQuests(allQuests)
}