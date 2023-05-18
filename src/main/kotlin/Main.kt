fun main(args: Array<String>) {
    val likes = 10050011

    when {
        likes % 10 == 1 && likes % 100 != 11 -> println("Понравилось $likes человеку")
        else -> println("Понравилось $likes людям")
    }
}