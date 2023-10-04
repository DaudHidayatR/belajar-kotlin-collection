package app

fun main() {
    val list: List<Pair<String,String>> = listOf(
        "Daud" to "Muh",
        "Hidayat" to "Rizki",
        "Ramadhan" to "Siraj"
    )
    val pair = list.unzip()
    println(pair.first)
    println(pair.second)
}