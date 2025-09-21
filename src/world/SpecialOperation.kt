package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isCovert: Boolean
) : Mission(title, reward) {

    override fun describe() {
        val mode = if (isCovert) "Секретно" else "Открыто"
        println("Спецоперация '$title'. Уровень допуска: $requiredClearance, режим: $mode, награда: $reward")
    }

    fun showReward() {
        println("Требуемый допуск: $requiredClearance")
        println("Режим секретности: ${if (isCovert) "Совершенно секретно" else "Обычный"}")
    }
}