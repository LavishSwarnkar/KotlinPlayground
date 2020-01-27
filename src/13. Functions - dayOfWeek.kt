import java.util.*

fun main(args: Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    print("Today is ${when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "IDK"
    }}")
}