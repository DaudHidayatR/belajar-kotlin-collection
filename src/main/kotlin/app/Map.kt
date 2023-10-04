package app

fun main() {
    val map: Map<String, Int> = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3
    )
    println(map["a"])
    println(map["b"])
    println(map["c"])
    println(map["d"])
    for ((key, value) in map) {
        println("$key -> $value")
    }
}