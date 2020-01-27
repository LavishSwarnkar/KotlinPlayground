fun main(args: Array<String>){
    val hour = args[0].toInt()
    print(if (hour < 12) "Good Morning" else "Good Night" + ", Kotlin!")
}