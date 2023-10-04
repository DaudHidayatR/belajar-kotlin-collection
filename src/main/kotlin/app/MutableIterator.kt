package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayMutableIterable(mutableListOf("Daud", "Hidayat", "Ramadhan"))
    displayMutableIterable(mutableSetOf("Daud", "Hidayat", "Ramadhan"))
    displayMutableIterable(mutableMapOf("a" to "Daud", "b" to "Hidayat", "c" to "Ramadhan").entries)
}