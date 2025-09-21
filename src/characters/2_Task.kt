import characters.Trader
import world.Quest
import world.QuestType

fun main() {
    val trader = Trader("Борис")

    // Добавим несколько квестов вручную
    trader.addQuest(Quest("Доставить письмо", 2, 50, "Легкий", QuestType.DELIVERY))
    trader.addQuest(Quest("Уничтожить волков", 3, 100, "Средний", QuestType.ELIMINATION))
    trader.addQuest(Quest("Сопровождать купца", 5, 200, "Сложный", QuestType.ESCORT))

    // Запускаем меню
    trader.start()
}
