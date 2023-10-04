package app
class Member(val name: String, val hobbies: List<String>)
fun main() {
    val list : List<List<String>> = listOf(
        listOf("a", "b", "c"),
        listOf("d", "e", "f"),
        listOf("g", "h", "i")
    )
    val listString: List<String> = list.flatten()
    println(listString)

    val members:List<Member> = listOf(
        Member("Budi", listOf("Game", "Coding")),
        Member("Joko", listOf("Game", "Coding")),
        Member("Rudi", listOf("Game", "Coding"))
    )
//    val hobbies= members.map { it.hobbies }.flatten()
    val hobbies = members.flatMap { it.hobbies }
    println(hobbies)
}
