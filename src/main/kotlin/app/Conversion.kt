package app

fun main() {
    val array = arrayOf("Daud", "Hidayat", "Ramadhan")
    val range = 1..10

    val list = array.toList()
    val set = array.toSet()
    val map = array.map { it to it.length }.toMap()

    val mutableList = array.toMutableList()
    val mutableSet = array.toMutableSet()
}