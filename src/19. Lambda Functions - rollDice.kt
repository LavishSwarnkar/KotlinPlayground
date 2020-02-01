import kotlin.random.Random

fun main(args: Array<String>) {
    val rollDice = {
        sides : Int -> if (sides == 0) 0 else Random.nextInt(sides) + 1
    }

    //function type notation
    val rollDice2 : (Int) -> Int = {
        sides -> if (sides == 0) 0 else Random.nextInt(sides) + 1
    }

    println(rollDice(5))
    println(rollDice(4))
    println(rollDice2(0))

    //Passing lambda as an argument
    playGame(5, rollDice)

    //Passing named function as argument
    playGame(6, ::rollDice3)
}

fun rollDice3(sides : Int): Int{
    return if (sides == 0) 0 else Random.nextInt(sides) + 1
}

fun playGame(sides: Int, op: (Int) -> Int) {
    println("You got ${op(sides)}")
}