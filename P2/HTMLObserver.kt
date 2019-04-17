package P2

import java.io.File

class HTMLObserver(private val name : String) : NumberObserver {

    override fun Update(value: Int) {
        val f = File("${this.name}.html")
        f.appendText("<p> NextValue: $value </p>")
    }
}