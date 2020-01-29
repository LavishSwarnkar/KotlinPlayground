import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Enter A number in range 1-10: ")
    val i = sc.nextInt()

    /*when (i){
        in arrayOf(2,3,5,7) -> print("$i is Prime number")
        1 -> print("$i is neither Prime nor Composite number")
        else -> print("$i is Composite number")
    }*/

    //OR

    print(when (i){
        in arrayOf(2,3,5,7) -> "$i is Prime number"
        1 -> "$i is neither Prime nor Composite number"
        else -> "$i is Composite number"
    })
}