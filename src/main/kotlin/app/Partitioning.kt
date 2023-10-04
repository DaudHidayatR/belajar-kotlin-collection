package app

fun main() {
    val list: List<String> = listOf("daud", "hidayat", "Ramadhan")


    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }

    val(list1, list2) = list.partition { it.length > 5 }

    println(pair)
    println(list1)
    println(list2)
}