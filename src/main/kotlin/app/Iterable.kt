package app

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Daud", "Hidayat", "Ramadhan"))
    displayIterable(setOf("Daud", "Hidayat", "Ramadhan"))
    displayIterable(mapOf("a" to "Daud", "b" to "Hidayat", "c" to "Ramadhan").entries)
}