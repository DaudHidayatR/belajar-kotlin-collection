package app

fun main() {
    val list1 = listOf("Daud", "Hidayat", "Ramadhan")
    val list2 = listOf("Muh", "Rizki", "Siraj")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    val list4: List<String> = list1.zip(list2) { item1, item2 ->
        "$item1 $item2"
    }
    println(list3)
    println(list4)

}