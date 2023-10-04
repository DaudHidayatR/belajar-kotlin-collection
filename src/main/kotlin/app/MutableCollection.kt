package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}
fun main(){
//    displayMutableCollection(listOf("Daud", "Hidayat", "Ramadhan"))
//    displayMutableCollection(setOf("Daud", "Hidayat", "Ramadhan"))
//    displayMutableCollection(mapOf("a" to "Daud", "b" to "Hidayat", "c" to "Ramadhan").entries)
    displayMutableCollection(mutableListOf("Daud", "Hidayat", "Ramadhan"))
    displayMutableCollection(mutableSetOf("Daud", "Hidayat", "Ramadhan"))
    displayMutableCollection(mutableMapOf("a" to "Daud", "b" to "Hidayat", "c" to "Ramadhan").entries)
}