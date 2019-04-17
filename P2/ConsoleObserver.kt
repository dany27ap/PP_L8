package P2

class ConsoleObserver : NumberObserver{
    override fun Update(value: Int) {
        println("NextValue : $value")
    }
}