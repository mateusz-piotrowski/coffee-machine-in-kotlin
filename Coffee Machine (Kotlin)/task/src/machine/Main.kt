package machine

fun main() {
    println("Write how many ml of water the coffee machine has:")
    val water = readLine()!!.toInt()

    println("Write how many ml of milk the coffee machine has:")
    val milk = readLine()!!.toInt()

    println("Write how many grams of coffee beans the coffee machine has:")
    val beans = readLine()!!.toInt()

    println("Write how many cups of coffee you will need:")
    val cups = readLine()!!.toInt()

    // Calculate maximum cups possible for each resource
    val maxWaterCups = water / 200
    val maxMilkCups = milk / 50
    val maxBeansCups = beans / 15

    // Find the limiting factor (minimum of all maximums)
    val maxPossibleCups = minOf(maxWaterCups, maxMilkCups, maxBeansCups)

    when {
        maxPossibleCups == cups -> println("Yes, I can make that amount of coffee")
        maxPossibleCups > cups -> println("Yes, I can make that amount of coffee (and even ${maxPossibleCups - cups} more than that)")
        else -> println("No, I can make only $maxPossibleCups cups of coffee")
    }
}
