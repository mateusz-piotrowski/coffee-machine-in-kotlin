package machine

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Write how many cups of coffee you will need:")
    val cups = scanner.nextInt()

    val water = cups * 200
    val milk = cups * 50
    val beans = cups * 15

    println("For $cups cups of coffee you will need:")
    println("${water} ml of water")
    println("${milk} ml of milk")
    println("${beans} g of coffee beans")
}
