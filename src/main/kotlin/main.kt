fun main() {
    val lastPurchase = 9000
    val purchase = 3000.0
    val regularCustomer = true
    var sum = 0.0

    if (lastPurchase < 1000) sum = purchase
    else if (lastPurchase > 1001 && lastPurchase < 10000) sum = purchase -100
    else if (lastPurchase > 10001) sum = purchase * 0.95
    if (regularCustomer) sum = sum * 0.99

    println("Итого: " + sum)
}