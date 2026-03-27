fun main(){
    // Loopng from a higher number to a lower number by use of for loop
    // Loop from 10 to 1


    for(x in 10 downTo 1){
        println(x)
    }
    println("------------------------")

    // odd numbers from 20 to 10
    for(y in 20 downTo 10){
        if(y % 2 != 0){
            println(y)
        }
    }

}