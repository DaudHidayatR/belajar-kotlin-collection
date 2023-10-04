package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}
fun main(){
    displayCollection(listOf("Daud", "Hidayat", "Ramadhan"))
    displayCollection(setOf("Daud", "Hidayat", "Ramadhan"))
    displayCollection(mapOf("a" to "Daud", "b" to "Hidayat", "c" to "Ramadhan").entries)

}