package app

fun main() {
    val numbers = (0..100).toList()
    val slice = numbers.slice(10..20)
    println(slice)

    val list2 = numbers.slice(0..10 step 2)
    println(list2)

    val list3 = numbers.slice(100 downTo 90)
    println(list3)

}