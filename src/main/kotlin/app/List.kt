package app

fun main() {
    val list: List<String> = listOf("Daud", "Hidayat", "Ramadhan")
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Daud"))
    println(list.indexOf("Hidayat"))
    println(list.indexOf("Ramadhan"))
    println(list.indexOf("siraj"))
    println(list.contains("daud"))
    println(list.contains("siraj"))
    println(list.containsAll(listOf("daud", "hidayat", "ramadhan")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}