import java.util.*

fun main(args: Array<String>){
    print("Enter A number: ")
    val x : Int = Scanner(System.`in`).nextInt()

    //Normal type casting .to...()
    println("Float x = ${x.toFloat()}")
    println("Double x = ${x.toDouble()}")
    println("Long x = ${x.toLong()}")

    //Number system conversions
    println("Binary string x = ${x.toString(2)}")
    println("Octal string x = ${x.toString(8)}")
    println("Hex string x = ${x.toString(16)}")
}