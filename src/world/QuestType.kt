package world

enum class QuestType(val description: String) {
    DELIVERY("Доставка предмета"),
    ELIMINATION("Устранение противника"),
    ESCORT("Сопровождение персонажа"),
    EXPLORE("Исследование новой территории"),
    BOSSFIGHT("Битва с боссом")
}