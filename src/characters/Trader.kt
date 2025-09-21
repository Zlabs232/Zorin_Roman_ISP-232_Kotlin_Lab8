package characters
import world.Quest

class Trader(val name: String,
             private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
        println("Доступные квесты от $name")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота.")
        }
    }

    fun giveQuest(index: Int): Quest {
        return quests[index - 1]
    }

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name")
    }
}