fun main() {
    val likes = 111
    var people = "людям"
    val regex = """[^1]1$""".toRegex()
    if (likes == 1 || regex.containsMatchIn(likes.toString())) {
        people = "человеку"
    }
    println("Понравилось $likes $people")
}