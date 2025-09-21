package world

open class Mission(
    val title: String,
    val reward: Int
){
    open fun describe() {
        println("Миссия: $title, награда: $reward золотых")
    }

    open fun isHighReward(): Boolean {
        return reward > 1000
    }
}
