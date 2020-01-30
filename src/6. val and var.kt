fun main(args: Array<String>){
    //var is mutable
    var x : Int = 6
    x = 88
    print("x = $x")

    //val is immutable
    val y : Int = 6
    //y = 88 causes error
    print("y = $y")

    val b = A(5)
    b.i
}

class A(val i : Int){

}