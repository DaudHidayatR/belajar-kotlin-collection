package app

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = list1 + 4
    println(list2)
    val list3 = list2 + (5..7)
    println(list3)
    val list4 = list3 - 6

    val map1 = mapOf(1 to "one", 2 to "two")
    val map2 = map1 + (3 to "three")
    println(map2)

}