package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Daud"),
        Person("Hidayat"),
        Person("Ramadhan"),
        Person("Ramadhan")
    )
    println(set.size)
    println(set.contains(Person("Daud")))
    for (person in set) {
        println(person.name)
    }
}