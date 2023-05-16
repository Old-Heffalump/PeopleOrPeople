fun main(args: Array<String>) {
    val likes: Int = 3

    val peoplesValue =  if (likes % 11 == 0) {
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1){
        println("Понравилось $likes человеку")} else {
            println("Понравилось $likes людям")
        }
}