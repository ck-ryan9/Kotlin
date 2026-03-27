fun main(){
    // For Loop
    // It is used to execute a block of code/statements a number of times until a condition is met

    for(number in 1..10){
        println("The count is : $number")
    }
    println("=========================")

    for (number in 50..65){
        println("The count is : $number")
    }

    println("=========================")

    for(x in 20..40 step 2)(
        println(x)
    )

     println("=========================")

    for(x in 20..40 ){
        if (x % 2 != 0){
        println(x)
            
        }
}

    println("========================")

      for (a in 1..5){
        val prod = a *5
        println("5 * $a = $prod")
      }

      println("=====================")
      var factorial = 1

      for(x in 1..5){
        factorial = factorial * x
        println(factorial)
        
      }
        println("Factorial of 5 is = $factorial")
      


}

