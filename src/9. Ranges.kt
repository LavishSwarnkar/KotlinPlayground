import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Enter starting number: ")
    val i = sc.nextInt()

    print("Enter ending number: ")
    val j = sc.nextInt()

    for (x in i..j)
        print("$x, ")
    println()

    for (x in j downTo i)
        print("$x, ")
    println()

    for (x in i..j step 2)
        print("$x, ")
    println()

    for (x in j downTo i step 2)
        print("$x, ")
}