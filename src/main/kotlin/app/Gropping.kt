package app

fun main() {
    val list = listOf("a", "b", "c", "d", "e", "f")
    val map: Map<String, List<String>> = list.groupBy { value -> value}
    println(map)
    val map2: Map<Int, List<String>> = list.groupBy { value -> value.length }
    println(map2)

    val grouping: Grouping<String, String> = list.groupingBy { value -> value }
    println(grouping)

}