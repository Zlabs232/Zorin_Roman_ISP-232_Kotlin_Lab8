package characters

import world.Quest
import world.QuestType

class Trader(val name: String, private val quests: MutableList<Quest> = mutableListOf()) {

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен.")
    }

    fun showAvailableQuests() {
        if (quests.isEmpty()) {
            println("Нет доступных квестов.")
        } else {
            println("Квесты от $name:")
            quests.forEachIndexed { index, quest ->
                println("${index + 1}. ${quest.title} (${quest.duration}ч, ${quest.reward} золота, ${quest.difficulty}, ${quest.questType})")
            }
        }
    }

    fun giveQuest(index: Int): Quest? {
        return quests.getOrNull(index - 1)
    }

    fun removeQuest(index: Int) {
        val quest = quests.getOrNull(index - 1)
        if (quest != null) {
            quests.removeAt(index - 1)
            println("Квест '${quest.title}' удален.")
        } else {
            println("Неверный номер квеста.")
        }
    }

    fun start() {
        while (true) {
            println("\nМеню:")
            println("1 - Добавить квест")
            println("2 - Показать квесты")
            println("3 - Взять квест")
            println("0 - Выйти")

            when (readln().toIntOrNull()) {
                1 -> addQuestFromConsole()
                2 -> showAvailableQuests()
                3 -> takeQuestFromConsole()
                0 -> return
                else -> println("Неверный ввод.")
            }
        }
    }

    private fun addQuestFromConsole() {
        print("Название: ")
        val title = readln()

        print("Длительность (часы): ")
        val duration = readln().toInt()

        print("Награда (золото): ")
        val reward = readln().toInt()

        print("Сложность: ")
        val difficulty = readln()

        print("Тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
        val questType = QuestType.valueOf(readln().uppercase())

        addQuest(Quest(title, duration, reward, difficulty, questType))
    }

    private fun takeQuestFromConsole() {
        showAvailableQuests()
        if (quests.isNotEmpty()) {
            print("Введите номер квеста: ")
            val index = readln().toInt()
            removeQuest(index)
        }
    }
}
