package P2

import java.util.*

interface InterfaceCompute {
    fun addObserver(obs : NumberObserver)
    fun removeObserver(obs : NumberObserver)
    fun generateNumber() : Int
}