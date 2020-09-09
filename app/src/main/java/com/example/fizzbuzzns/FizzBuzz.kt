package com.example.fizzbuzzns

fun main(){
    val max = getMax()
    val outputs = generateFizzBuzz0To(max)
    printOutputs(outputs)
}

fun getMax(): Int{
    println("Please enter the list maximum: ")
    return Integer.valueOf(readLine())
}

fun generateFizzBuzz0To(max: Int): MutableList<String>{
    val outputs = mutableListOf<String>()
    for (i in 1..max){
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
        }
        if (output.size==0){
            output.add(i.toString())
        }
        if (multipleOf(i,17)){
            output.reverse()
        }
        val outputString = concatenateOutputIntoString(output)
        outputs.add(outputString)
    }
    return outputs
}

fun multipleOf(toCheck: Int, multiple: Int) = toCheck%multiple==0

fun concatenateOutputIntoString(output: MutableList<String>): String{
    var outputString = ""
    for (word in output){
        outputString += word
    }
    return outputString
}

fun printOutputs(outputs: MutableList<String>){
    for (output in outputs){
        println(output)
    }
}