package com.Jay

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human(66.5f,1.7f)
    h.hello()
    println(h.bmi())
//    var age = 419
//    age = 20
//    var wei = 66.5f
//    var name : String
//    name = "JAU"

}

class Human(var weight: Float, var height: Float){
    fun bmi(): Float{
        val bmi = weight/(height * height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")

    }
}