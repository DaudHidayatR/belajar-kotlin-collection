package app

fun main() {
    val list: List<String> = listOf("daud", "hidayat", "Ramadhan")
//    val temp = mutableListOf<String>()
//    for (name in list) {
//        temp.add(name.toUpperCase())
//    }
    val list2 = list.map { it.toUpperCase() }
    println(list2)

    val set = setOf("daud", "hidayat", "Ramadhan")
    val set2 = set.map { it.toUpperCase() }
    println(set2)

    val numbers = listOf(1, 2, 3, 4, 5)
    val numberGenap = numbers.mapIndexedNotNull { index, value ->
        if (index % 2 == 0) null
        else value
    }
    println(numberGenap)

    val numbers2 = listOf(1, 2, 3, 4, 5)
    val numberGanjil = numbers2.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(numberGanjil)

    val numbers3 = (1..100).toList()
    val ganjil = numbers3.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(ganjil)
}