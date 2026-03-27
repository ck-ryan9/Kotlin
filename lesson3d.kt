fun main(){
    // Arrays
    // It is a collection of items that are related in nature
    // To access an item in an array we use the index starting from zero
    // To create an array we use the arrayOf function

    val numbers = arrayOf(25 ,54, 54, 32, 74, 36, 74, 31)

    println(numbers.contentToString())

    // Accessing items of an array by use of index
    println("Item on index three is: " + numbers[3])
}