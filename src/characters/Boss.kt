package characters
class Boss(
    name: String,
    hp: Int,
    element: String,
    val phaseCount: Int,
    val isFinalBoss: Boolean,
    aggressionLevel: Int = 2
) : Enemy(name, hp, element, aggressionLevel) {

    fun startPhase() {
        println("$name начинает новую фазу боя")
    }

    fun dropLoot() {
        println("$name роняет лут")
    }
}