package P2

import java.io.File

class TextObserver(private val name : String) : NumberObserver {
    override fun Update(value: Int) {
        File("${name}.txt").appendText("NextValue: $value\n")
    }
}