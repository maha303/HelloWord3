
import kotlin.io.readLine as readLine
import kotlin.random.Random


fun main(){
    val num1 = Random.nextInt(10)
    var i = 0
    println("Welcome  type 'quit'  to exit ")

    while(i<3) {
        print("Guess a number between 0 and 10: ")
        val guess = readLine()
        if (guess == "quit") {
            println("Exiting game...")
            break
        }
        try {
            if(guess!!.toInt() == num1){
                println("You got it!")
                break
            }else{
                if(i==2){
                    println("You lose. The number was $num1.")
                    break
                }else{
                    println("Try again")
                }
            }
            i++
            println("You have guessed $i time(s).")
        }catch (e: Exception){
            println("Please enter numbers only.")
        }
    }
    println("Game Finished")
}