package magic

class InstantSpell(
    name: String,
    symbol: String,
    val power: Int
) : MagicEffect(name, symbol, duration = 0) {
}