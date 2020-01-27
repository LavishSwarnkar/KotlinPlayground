fun main(args: Array<String>){
    val array = Array(5) {(it+5) * 5}
    for ((index, value) in array.withIndex())
        println("array[$index] = $value")
}