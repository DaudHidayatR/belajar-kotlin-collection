package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Daud")
    mutableMap["b"] = "hidayat"
    mutableMap["c"] = "ramadhan"

    println(mutableMap["a"])
    println(mutableMap["b"])
    println(mutableMap["c"])
    println(mutableMap["d"])

    mutableMap.remove("a")
    for ((key, value) in mutableMap) {
        println("$key -> $value")
    }
}