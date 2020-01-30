import java.util.*

fun main(args: Array<String>){
    print("Enter year: ")
    val year : Int = Scanner(System.`in`).nextInt()

    //if else check or any expression in String Templates
    println("Year $year is ${if (year%400 == 0 || (year%100 != 0 && year%4 == 0)) "" else "not "}A Leap year")
}