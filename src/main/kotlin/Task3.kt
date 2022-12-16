import kotlin.math.roundToInt

fun main() {
    val isRegularUser = true
    var amount = 10_006
    if (amount > 1_000 && amount < 10_001) {
        amount -= 100
    } else if (amount >  10_000) {
        amount = amount - (amount * 0.05).roundToInt()
    }
    if (isRegularUser) amount = amount - (amount * 0.01).roundToInt()

    println("Сумма покупки составила $amount рублей")
}