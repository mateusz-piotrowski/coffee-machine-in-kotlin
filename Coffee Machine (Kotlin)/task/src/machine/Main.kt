package machine

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        val action = readLine()!!.trim().lowercase()

        when (action) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val choice = readLine()!!.trim().lowercase()

                if (choice == "back") continue

                val coffeeType = choice.toIntOrNull()
                when (coffeeType) {
                    1 -> if (buyCoffee(250, 0, 16, 1, 4, water, milk, beans, cups)) {
                        water -= 250
                        beans -= 16
                        cups -= 1
                        money += 4
                    }
                    2 -> if (buyCoffee(350, 75, 20, 1, 7, water, milk, beans, cups)) {
                        water -= 350
                        milk -= 75
                        beans -= 20
                        cups -= 1
                        money += 7
                    }
                    3 -> if (buyCoffee(200, 100, 12, 1, 6, water, milk, beans, cups)) {
                        water -= 200
                        milk -= 100
                        beans -= 12
                        cups -= 1
                        money += 6
                    }
                }
            }

            "fill" -> {
                print("Write how many ml of water you want to add: ")
                water += readLine()!!.toInt()
                print("Write how many ml of milk you want to add: ")
                milk += readLine()!!.toInt()
                print("Write how many grams of coffee beans you want to add: ")
                beans += readLine()!!.toInt()
                print("Write how many disposable cups you want to add: ")
                cups += readLine()!!.toInt()
            }

            "take" -> {
                println("I gave you $$money")
                money = 0
            }

            "remaining" -> {
                println("The coffee machine has:")
                println("$water ml of water")
                println("$milk ml of milk")
                println("$beans g of coffee beans")
                println("$cups disposable cups")
                println("$$money of money")
            }

            "exit" -> return
        }
    }
}

fun buyCoffee(waterNeeded: Int, milkNeeded: Int, beansNeeded: Int, cupsNeeded: Int, price: Int,
              currentWater: Int, currentMilk: Int, currentBeans: Int, currentCups: Int): Boolean {
    if (currentWater < waterNeeded) {
        println("Sorry, not enough water!")
        return false
    }
    if (currentMilk < milkNeeded) {
        println("Sorry, not enough milk!")
        return false
    }
    if (currentBeans < beansNeeded) {
        println("Sorry, not enough beans!")
        return false
    }
    if (currentCups < cupsNeeded) {
        println("Sorry, not enough cups!")
        return false
    }
    println("I have enough resources, making you a coffee!")
    return true
}
