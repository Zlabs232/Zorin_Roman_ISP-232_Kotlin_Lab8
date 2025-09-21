package characters

class NPC(
    name: String = "NPC",
    hp: Int = 100,
    element: String = "sdfsf",
    val faction: String = "sdfsf",
    val hasQuest: Boolean = false
) : GameCharacter(name, hp, element) {

    fun giveQuest() {
        println("$name выдает квест")
    }

    fun trade() {
        println("$name торгует")
    }
}