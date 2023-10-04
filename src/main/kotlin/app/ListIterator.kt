package app

fun <T> displayIterator(listIterator: ListIterator<T>) {
    println("display next")
  while (listIterator.hasNext()) println(listIterator.next())
    println("display previous")
    while (listIterator.hasPrevious()) println(listIterator.previous())
}
fun main() {
    displayIterator(listOf("Daud", "Hidayat", "Ramadhan").listIterator())
    displayIterator(mutableListOf("Daud", "Hidayat", "Ramadhan").listIterator())
}