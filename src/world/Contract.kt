package world

class Contract(
    title: String,
    val clientName: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
) : Mission(title, reward) {

    override fun describe() {
        val urgency = if (isUrgent) " (СРОЧНО)" else ""
        println("Контракт от $clientName: $taskDescription$urgency, награда: $reward")
    }

    fun printContractInfo() {
        println("Название контракта: $title")
        println("Заказчик: $clientName")
        println("Задача: $taskDescription")
        println("Награда: $reward монет")
        println("Срочный: ${if (isUrgent) "Срочно!" else "Обычный контракт"}")
    }
}