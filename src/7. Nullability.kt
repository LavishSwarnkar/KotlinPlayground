fun main(args: Array<String>){
    var x = 9
    //x = null          <- Not allowed

    val y : Int? = 9    //Can take null
    //y.toLong          <- Not allowed
    //y = null          //OK
    println(y?.toLong())  //OR
    println(y!!.toLong())

    val z : Int? = null
    //?: Elvis operator for null check and fallback value
    println(z?.toLong() ?: 5)
}