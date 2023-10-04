package app

fun main() {
    val list = listOf("daud","hidayat", "Ramadhan")
    val list2 = list.filter { it.length > 5 }
    println(list2)

    val list3 = list.filterIndexed { index, s -> (index + s.length) % 2 == 0 }
    println(list3)

    val list4: List<Any?> = listOf("daud", 1, 2, 3, "hidayat", "Ramadhan", null)
    val list5 = list4.filterIsInstance<String>()
    println(list5)

    val list6 = list4.filterNotNull()
    println(list6)

}