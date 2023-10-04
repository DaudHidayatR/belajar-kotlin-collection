package app

fun main() {
    val pair: Pair<String, String> = Pair("Daud", "Hidayat")
    println(pair.first)
    println(pair.second)
    val pair2: Pair<String, String> = "daud" to "hidayat"
    println(pair2.first)
    println(pair2.second)
}