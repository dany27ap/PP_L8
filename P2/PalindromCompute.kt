package P2

import java.io.File
import kotlin.random.Random

class PalindromCompute : InterfaceCompute {

    val observers = mutableListOf<NumberObserver>()

    override fun addObserver(obs: NumberObserver) {
        observers.add(obs)
    }

    override fun removeObserver(obs: NumberObserver) {
        observers.remove(obs)
    }

    private fun isPalindrom(n : Int) : Boolean {
        var result: Boolean = true

        var numberAux = n
        var reversedNumber = 0

        while ( numberAux > 0 ) {

            val rightDigit = numberAux % 10
            reversedNumber = reversedNumber * 10 + rightDigit
            numberAux /= 10
        }

        result = n == reversedNumber

        return result
    }

    fun run(){
        var i = 0
        var start = System.currentTimeMillis()
        var end = start
        val f = File("Palindrom.html")
        f.writeText("<html> <head> <title>PP Lab-8 P1</title> <meta http-equiv=\"refresh\" content=\"2\"> </head> <body>")
        do{
            if(isPalindrom(i)){
                end = System.currentTimeMillis()
                if((end - start).toInt() % 1000 == 0){
                    observers.forEach{ it.Update(i) }
                }
            }
            i++
        }while ((end - start) < 10000)
        f.appendText("</body> </html>")
    }

    override fun generateNumber(): Int {
        var nextVal = Random.nextInt(0, 1000)
        while(!isPalindrom(nextVal)){
            nextVal = Random.nextInt(0, 1000)
        }
        observers.forEach{
            it.Update(nextVal)
        }
        return nextVal
    }
}
