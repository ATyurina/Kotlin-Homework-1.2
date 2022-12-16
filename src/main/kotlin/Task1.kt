fun main() {
    val amount = 10000
    if (amount > 34) {
        val commission =  amount * 0.0075
        println("Комиссия за перевод составила: $commission рублей")
    } else {
        println("Минимальная сумма перевода составляет 35 рублей")
    }
}