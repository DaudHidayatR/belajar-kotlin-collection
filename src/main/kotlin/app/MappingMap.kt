package app

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Daud",
        2 to "Hidayat",
        3 to "Ramadhan"
    )
    val mapKey = map.mapKeys { it.key * 10 }
    println(mapKey)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}
