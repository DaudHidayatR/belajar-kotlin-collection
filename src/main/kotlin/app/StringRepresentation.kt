package app

fun main() {
    val list = listOf("daud","hidayat", "Ramadhan")

    val String1 = list.joinToString(" ", "|","|")
    println(String1)

    val string2 = list.joinToString(" ", "|","|"){it.toUpperCase()}

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|","|")
    list.joinTo(builder, " ", ">","<")
    list.joinTo(builder, " ", "@","@")

    val string3 = builder.toString()
    println(string3)

}