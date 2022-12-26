import kotlin.math.roundToInt

fun main() {
    val isRegularUser = true
    var amount = 10_006
    when(amount){
        in 0..1_000 -> amount
        in 1_001..10_000 -> amount -= 100
        else -> amount = amount - (amount * 0.05).roundToInt()
    }
    if (isRegularUser) amount = amount - (amount * 0.01).roundToInt()

    println("Сумма покупки составила $amount рублей")
}