import java.util.*

fun main(args: Array<String>){
    print("Enter A number: ")
    val x : Int = Scanner(System.`in`).nextInt()

    //Using String templates
    println("You entered $x")
    println("2 * $x = ${2*x}")
    println("$x / 7.0f = ${x.div(7.0f)}")
}