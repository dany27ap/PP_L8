package P1

import java.util.*

@Suppress("DEPRECATION")
class Employee(val name : String) : Observable() {

    private var clientList : MutableList<Client> = mutableListOf()

    fun pourAlchool(produs: MutableList<Products>){
        for(p in produs) {
            setChanged()
            notifyObservers(p)
        }
    }

    fun addClient(client : Client){
        clientList.add(client)
    }

    fun satisfiesClients(){
        while(!clientList.isEmpty()){
            val client = clientList.removeAt(0)
            addObserver(client)
            pourAlchool(client.getProduct())
        }
    }
}