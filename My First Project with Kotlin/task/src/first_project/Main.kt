package first_project

fun main() {
    val products = mapOf("Bubblegum" to 202, "Toffee" to 118, "Ice cream" to 2250, "Milk chocolate" to 1680, "Doughnut" to 1075, "Pancake" to 80)
    var total = 0

    println("Earned amount:")

    for ((product, price) in products) {
        println("$product: $price")
        total += price
    }

    println("Income: $total")
}