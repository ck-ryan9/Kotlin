fun main(){
    // Functions with parameters
    // Parameters are inputs that get passed as arguments




    fun greeting(name :String){
        println("Hello $name, Hope you aare well?")
    }

    // When function is called you pass a given name as an argument
    greeting("Ryan")

        println("===============================")

    // Below is an example of a function that is able to calculate the BMI of a person
    fun BMI (weight : Double, height :Double){
        val answer = weight / (height * height)


         println ("The BMI of the person is " + answer)

    }
     BMI(69.5, 1.73)

     fun checkNumber(){
        val num = 4

        if (num % 2 == 0){
            println("$num is even")
        }
        else{
            println("$num is odd")
        }
     }
     checkNumber







}