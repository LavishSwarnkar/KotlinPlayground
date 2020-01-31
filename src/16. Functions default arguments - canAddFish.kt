fun main(args: Array<String>){
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize : Double
               , currentFish : List<Int>
               , fishSize : Int = 2
               , hasDecorations : Boolean = true) : Boolean{
    return ((tankSize * if (hasDecorations) 0.8 else 1.0) - currentFish.sum()) >= fishSize
}

/*fun canAddFish(tankSize : Float
                , currentFish : List<Int>
                , fishSize : Int = 2
                , hasDecorations : Boolean = true) : Boolean{
    val r = if (hasDecorations) 2 else 0
    val sum = if (currentFish.isEmpty()) 0 else currentFish.reduce { sum, element -> sum + element }.toInt()
    return (tankSize-sum-r) >= fishSize
}*/
