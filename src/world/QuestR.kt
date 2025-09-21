package world

fun main() {
    val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        print("Название: ")
        val qTitle = readln()
        print("Время (в часах): ")
        val qDuration = readln().toInt()
        print("Награда: ")
        val qReward = readln().toInt()
        print("Сложность: ")
        val qDifficulty = readln()

        val q = Quest(qTitle, qDuration, qReward, qDifficulty)
        quests.add(q)
        println()
    }

    println("Все доступные квесты:")
    for (q in quests) {
//        q.printInfo()
        println("Золото в час: ${"%.2f".format(q.goldPerHour())} монет/час")
        println()
    }
}