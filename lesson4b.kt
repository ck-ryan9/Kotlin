fun main(){
    // Below is a function that is able to add two numbers

    fun addition(){
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        println("The sum of the numbers is : $sum")
    }

    addition()
    println("===================")

    // Multiply 3 numbers
    fun product(){
        val number3 = 2
        val number4 = 3
        val number5 = 5
        val product = number3 * number4 * number5

        println("The product of the numbers is: $product")

    
    }
    product()

    println("================")


    fun compare(a : Int, b:Int){
    val a  = 8
    val b  = 3

    if (a> b){
        println("Largest: $a ")
        println ("Smallest : $b")
    }
    else{
        println("Largest : $b")
        println("Smallest: $b")
    }
}   
    

   
}