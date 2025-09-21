package world

//import characters.Hero

fun main() {
    val quest = Quest(
        title = "Поиск артефакта",
        duration = 3,
        reward = 800,
        difficulty = "Средний"
    )

    val contract = Contract(
        title = "Защита каравана",
        clientName = "Гильдия купцов",
        taskDescription = "Охрана груза",
        reward = 1200
    )

    val specialOp = SpecialOperation(
        title = "Операция 'Тень'",
        reward = 2500,
        requiredClearance = 2,
        isCovert = true
    )

    println("=== ИНФОРМАЦИЯ О КВЕСТЕ ===")
    println("Название: ${quest.title}, Награда: ${quest.reward}")
    println("Длительность: ${quest.duration} часов")
    println("Сложность: ${quest.difficulty}")

    println("\n=== ИНФОРМАЦИЯ О КОНТРАКТЕ ===")
    println("Название: ${contract.title}, Награда: ${contract.reward}")
    println("Заказчик: ${contract.clientName}")
    println("Описание задачи: ${contract.taskDescription}")

    println("\n=== ИНФОРМАЦИЯ О СПЕЦОПЕРАЦИИ ===")
    println("Название: ${specialOp.title}")
    println("Награда: ${specialOp.reward}")
    specialOp.showReward()

    // Демонстрация работы методов
    println("\n=== ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ===")
//    quest.printInfo()
    println("\n---")
    contract.printContractInfo()
}