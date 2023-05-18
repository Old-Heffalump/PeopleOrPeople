fun main(args: Array<String>) {
    val likes = 161


    when {
        likes == 1 || likes % 10 == 1 && likes != 11 -> println("Понравилось $likes человеку")
        else -> println("Понравилось $likes людям")
    }
}

