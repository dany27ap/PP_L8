package P2

import java.io.File
import kotlin.random.Random

class PrimeCompute  : InterfaceCompute{

    val observers = mutableListOf<NumberObserver>()


    private fun testPrime(n : Int) : Boolean {
        when(n){
            0 -> return false
            1 -> return false
            4 -> return false
            2 -> return true
            3 -> return true
            5 -> return true
            else -> {
                if(n%6==0 || n%6==2 || n%6==4)
                    return false
                if(n%5==0)
                    return false
                for(i in 2..Math.sqrt(n.toDouble()).toInt()){
                    if(n%i==0)
                        return false
                }
            }
        }
        return true
    }

    override fun addObserver(obs: NumberObserver) {
        observers.add(obs)
    }

    override fun removeObserver(obs: NumberObserver) {
        observers.remove(obs)
    }

    fun run(){
        var i = 0
        var start = System.currentTimeMillis()
        var end = start
        val f = File("Prime.html")
        f.writeText("<html> <head> <title>PP Lab-8 P1</title> <meta http-equiv=\"refresh\" content=\"2\"> </head> <body>")
        do{
            if(testPrime(i)){
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
        while(!testPrime(nextVal)){
            nextVal = Random.nextInt(0, 1000)
        }
        observers.forEach{
            it.Update(nextVal)
        }
        return nextVal
    }
}