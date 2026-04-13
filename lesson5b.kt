class Circle{
    // Properties
    var radius = 7
    var pie = 3.142

    // Behaviuours
    fun circleArea(){
        val areaofCircle = pie * radius * radius
        println("The area of the circle is " + areaofCircle + " ^2")
    }

    fun circleCircumference(){
        val circumference = 2 * pie * radius
        println("The circumference of the circle is " + circumference)
    }
}

fun main(){
    var myCircle = Circle()

    myCircle.circleArea()
    myCircle.circleCircumference()
}