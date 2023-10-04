package app

fun <T> displayMutableIterator(MutableListIterator: MutableListIterator<T>) {
    println("display next")
    while (MutableListIterator.hasNext()) println(MutableListIterator.next())
    println("display previous")
    while (MutableListIterator.hasPrevious()) println(MutableListIterator.previous())
}
fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) {
            mutableListIterator.remove()
        }
    }
}
fun main() {
    val mutableList = mutableListOf(1, 3, 8, 1,12,13,17,18,20)
    removeOddNumber(mutableList.listIterator())
    println(mutableList)
    displayMutableIterator(mutableList.listIterator())
}