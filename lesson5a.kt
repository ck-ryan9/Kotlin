class Person{
    // Attributes of a person// Properties of a person
    var name = "Ryan"
    var age = 18

    // Behaviours/actions/doables of a person
    fun walk(){
        println("The person can walk")
    }

    fun speak(){
        println("The person can speak")
    }

    fun eat(){
        println("The person can eat")
    }

    fun sleep(){
        println("The person can sleep")
    }
}

fun main(){
    // Object is a real world thing
    // An objecyt is intantiated from a class
    // For us to be able to either access the attributes or the behaviours of a class we need to create an object of that class

    // Below we create an object
    var myObject = Person()
    myObject.walk()
    myObject.speak()
    myObject.eat()
    myObject.sleep()

}
