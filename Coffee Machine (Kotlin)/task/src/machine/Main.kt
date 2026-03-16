package machine

fun main() {
    val machine = CoffeeMachine()

    machine.printState()
    println("Write action (buy, fill, take): ")

    when (readln().trim()) {
        "buy" -> machine.buy()
        "fill" -> machine.fill()
        "take" -> machine.take()
    }

    machine.printState()
}

class CoffeeMachine {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    fun printState() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$beans g of coffee beans")
        println("$cups disposable cups")
        println("$$money of money")
        println()
    }

    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        when (readln().trim()) {
            "1" -> buyEspresso()
            "2" -> buyLatte()
            "3" -> buyCappuccino()
        }
    }

    private fun buyEspresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250
            beans -= 16
            cups -= 1
            money += 4
            println("Enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources")
        }
    }

    private fun buyLatte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
            println("Enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources")
        }
    }

    private fun buyCappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
            println("Enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources")
        }
    }

    fun fill() {
        println("Write how many ml of water you want to add: ")
        water += readln().trim().toInt()
        println("Write how many ml of milk you want to add: ")
        milk += readln().trim().toInt()
        println("Write how many grams of coffee beans you want to add: ")
        beans += readln().trim().toInt()
        println("Write how many disposable cups you want to add: ")
        cups += readln().trim().toInt()
    }

    fun take() {
        println("I gave you $$money")
        money = 0
    }
}
