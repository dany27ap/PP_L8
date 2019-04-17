package P1

import java.io.File
import java.util.*

@Suppress("DEPRECATION")
class Client(private val name: String, private val products: MutableList<Products>) : Observer {

    override fun update(o: Observable?, arg: Any?) {
        when(o){
            is Employee -> {
                if(arg is Products){
                    for(p in products) {
                        File("BarulLuiDany.txt").appendText("$name bea $arg turnat de ${o.name}\n")
                        println("$name bea $arg turnat de ${o.name}\n")
                    }
                }
            }
            else -> {
                println().javaClass.toString()}
        }
    }

    fun getProduct() : MutableList<Products> {
        return this.products
    }
}