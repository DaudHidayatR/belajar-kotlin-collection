package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Daud")
    mutableList.add("Hidayat")
    mutableList.add("Ramadhan")

    mutableList.remove("Daud")
    for (name in mutableList) {
        println(name)
    }
}