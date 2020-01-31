fun main(args: Array<String>){
    var fortune: String? = null

    for (i in 1..10){
        fortune = getFortuneCookie()
        println(fortune)
        if(fortune == "Take it easy and enjoy life!")
            break
    }

    /*repeat(10){
        fortune = getFortuneCookie()
        println(fortune)
        if(fortune == "Take it easy and enjoy life!")
            break   <- Won't work
    }*/
}

fun getFortuneCookie() : String{
    val fortunes = arrayOf("You will have A great day!"
            , "Things will go well for you today."
            , "Enjoy A wonderful day of success."
            , "Be humble and all will turn out well."
            , "Today is A good day for exercising restraint."
            , "Take it easy and enjoy life!"
            , "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday % fortunes.size]
}
