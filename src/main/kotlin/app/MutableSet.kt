package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Daud"))
    mutableSet.add(Person("Hidayat"))
    mutableSet.add(Person("Ramadhan"))
    mutableSet.add(Person("Ramadhan"))

    for (person in mutableSet) {
        println(person.name)
    }
}