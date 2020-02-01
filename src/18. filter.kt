fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //filter that gets all the curries and sorts them by string length
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //filter to return all the spices that start with 'c' and end in 'e'.
    println(spices.filter { it.startsWith('c') && it.endsWith('e')})
    //OR
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })

    //take the first 3 elements of the list and return the ones that start with 'c'
    print(spices.subList(0, 3).filter { it[0] == 'c'})
}