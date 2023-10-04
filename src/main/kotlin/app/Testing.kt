package app

fun main() {
    val list = listOf("daud","hidayat", "Ramadhan")
    println(list.any {it.length > 5})
    println(list.none {it.length > 5})
    println(list.all {it.length > 5})
}