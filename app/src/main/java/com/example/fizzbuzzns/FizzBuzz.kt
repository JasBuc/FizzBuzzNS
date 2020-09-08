package com.example.fizzbuzzns

fun main(){
    fizzBuzz0To100()
}

fun fizzBuzz0To100(){
    for (i in 0..100){
        if (multipleOf(i,11)){
            print("Bong")
        }
        else {
            if (multipleOf(i, 3)) {
                print("Fizz")
            }
            if (multipleOf(i, 5)) {
                print("Buzz")
            }
            if (multipleOf(i, 7)) {
                print("Bang")
            }
            if (!multipleOf(i, 3) && !multipleOf(i, 5)) {
                print(i)
            }
        }
        println()
    }
}

fun multipleOf(toCheck: Int, multiple: Int) = toCheck%multiple==0