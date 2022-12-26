fun main() {
    val amount = 100
    val commission =  amount * 0.0075
    val minCommission = 35
    if (commission > minCommission) {
        println("Комиссия за перевод составила: $commission рублей")
    } else {
        println("Комиссия за перевод составила: $minCommission рублей")
    }
}