package P1

import java.io.File

fun main(args : Array<String>){

    val mike = Employee("Mike")
    val mircea = Employee("Mircea")
    val paul = Employee("Paul")

    val employee = mutableListOf<Employee>(mike, mircea, paul)

    employee[0].addClient(Client("Maria", mutableListOf(Products.VIN)))
    employee[0].addClient(Client("Ioana", mutableListOf(Products.BERE)))
    employee[1].addClient(Client("Jack", mutableListOf(Products.WISKEY)))
    employee[2].addClient(Client("Daniels", mutableListOf(Products.WISKEY)))

    employee.forEach { it.satisfiesClients() }
}
