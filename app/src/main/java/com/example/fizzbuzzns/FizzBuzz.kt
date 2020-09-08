package com.example.fizzbuzzns

fun main(){
    fizzBuzz0To100()
}

fun fizzBuzz0To100(){

    for (i in 0..100){
        val output = mutableListOf<String>()
        if (multipleOf(i,11)){
            if(multipleOf(i,13)){
                output.add("Fezz")
            }
            output.add("Bong")
        }
        else {
            if (multipleOf(i, 3)) {
                output.add("Fizz")
            }
            if(multipleOf(i,13)){
                output.add("Fezz")
            }
            if (multipleOf(i, 5)) {
                output.add("Buzz")
            }
            if (multipleOf(i, 7)) {
                output.add("Bang")
            }
            if (!multipleOf(i, 3) && !multipleOf(i, 5) && !multipleOf(i,7)) {
                output.add(i.toString())
            }
        }
        if (multipleOf(i,17)){
            output.reverse()
        }
        for (word in output){
            print(word)
        }
        println()
    }
}

fun multipleOf(toCheck: Int, multiple: Int) = toCheck%multiple==0