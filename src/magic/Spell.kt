package magic

class Spell(
    name: String,
    symbol: String,
    val width: Int = 0,
    val height: Int = 0
) : MagicEffect(name, symbol, duration = 10) {

    constructor(name: String, size: Int, symbol: String) : this(name, symbol, size, size)
    constructor() : this("", "", 0, 0)

    fun cast() {
        println("Кастуем $name!")
        for (i in 1..height) {
            for (j in 1..width) {
                print(symbol)
            }
            println()
        }
        println()
    }

    fun description(): String {
        return "Заклинание $name занимает область ${width}x$height, использует символ $symbol и длится $duration сек"
    }
}