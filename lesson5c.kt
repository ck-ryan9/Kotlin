// Inheritance is whereby a child class obtains the properties and behavioyurs of another class(Parent class)

 open class Animal{
    // properties
    var name = "Name"




  fun walk(){
        println("The animal can walk")
    }

    fun sleep(){
        println("The animal can sleep")
    }
}

// Below class inherits
class Dog:Animal(){
    fun bark(){
        println("The dog can bark")
    }
}

fun main(){
    var myDog =  Dog()

    myDog.bark()
    myDog.sleep()
    myDog.walk()
    
}