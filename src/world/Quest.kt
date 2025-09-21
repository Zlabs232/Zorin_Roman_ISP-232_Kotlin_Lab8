package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String
) : Mission(title, reward) {

    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Double {
        return reward.toDouble() / duration
    }
}