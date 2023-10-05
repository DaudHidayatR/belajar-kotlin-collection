package app

fun main() {
    val range = (0..100).toList()
    println( range.windowed(10, 1, false))
    println( range.windowed(10, 1, true))
    println( range.windowed(10, 1, false){it.size})
    println( range.windowed(10, 1, true){it.size})
}