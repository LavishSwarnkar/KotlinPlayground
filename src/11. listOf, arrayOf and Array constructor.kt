import java.util.*

fun main(args: Array<String>){
    val list = mutableListOf(5, 6, 7, 8, "B")
    //list = listOf(7)          <- Not allowed
    list.remove(6)  //  <- OK
    println(list)

    val array = arrayOf(3, 4, "A", 3.4)
    println(array.toList())

    val array2 = intArrayOf(3, 4, 5)
    println(array2[1])

    println(Arrays.toString(intArrayOf(2, 3)))

    println(Arrays.toString(arrayOf(1, 2, arrayOf("dolphin","whale","orka"))))

    val x = Array (5) { it * 5 }
    print(Arrays.toString(x))
}