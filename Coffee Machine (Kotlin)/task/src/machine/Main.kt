package machine

fun main() {
    val machine = CoffeeMachine()

    println("Write action (buy, fill, take, remaining, exit):")

    while (true) {
        val input = readln().trim()
        if (input == "exit") break
        machine.runCommand(input)
    }
}

class CoffeeMachine {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    private enum class State {
        MAIN, BUYING, FILLING_WATER, FILLING_MILK, FILLING_BEANS, FILLING_CUPS
    }

    private var state = State.MAIN

    fun runCommand(command: String) {
        val input = command.trim()

        when (state) {
            State.MAIN -> handleMainMenu(input)
            State.BUYING -> handleBuying(input)
            State.FILLING_WATER -> handleFillingWater(input)
            State.FILLING_MILK -> handleFillingMilk(input)
            State.FILLING_BEANS -> handleFillingBeans(input)
            State.FILLING_CUPS -> handleFillingCups(input)
        }
    }

    private fun handleMainMenu(input: String) {
        when (input) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                state = State.BUYING
            }
            "fill" -> {
                println("Write how many ml of water you want to add:")
                state = State.FILLING_WATER
            }
            "take" -> {
                println("I gave you $$money")
                money = 0
            }
            "remaining" -> printState()
            "exit" -> {}
            else -> println("Write action (buy, fill, take, remaining, exit):")
        }
    }

    private fun handleBuying(input: String) {
        when (input) {
            "1" -> makeEspresso()
            "2" -> makeLatte()
            "3" -> makeCappuccino()
            "back" -> {
                state = State.MAIN
                println("Write action (buy, fill, take, remaining, exit):")
            }
        }
    }

    private fun handleFillingWater(input: String) {
        water += input.toInt()
        println("Write how many ml of milk you want to add:")
        state = State.FILLING_MILK
    }

    private fun handleFillingMilk(input: String) {
        milk += input.toInt()
        println("Write how many grams of coffee beans you want to add:")
        state = State.FILLING_BEANS
    }

    private fun handleFillingBeans(input: String) {
        beans += input.toInt()
        println("Write how many disposable cups you want to add:")
        state = State.FILLING_CUPS
    }

    private fun handleFillingCups(input: String) {
        cups += input.toInt()
        state = State.MAIN
        println("Write action (buy, fill, take, remaining, exit):")
    }

    private fun makeEspresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250
            beans -= 16
            cups -= 1
            money += 4
            println("I have enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources!")
        }
        state = State.MAIN
        println("Write action (buy, fill, take, remaining, exit):")
    }

    private fun makeLatte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
            println("I have enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough water!")
        }
        state = State.MAIN
        println("Write action (buy, fill, take, remaining, exit):")
    }

    private fun makeCappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
            println("I have enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources!")
        }
        state = State.MAIN
        println("Write action (buy, fill, take, remaining, exit):")
    }

    fun printState() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$beans g of coffee beans")
        println("$cups disposable cups")
        println("$$money of money")
        println()
        println("Write action (buy, fill, take, remaining, exit):")
    }
}
