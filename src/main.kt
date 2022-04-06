fun main(){
    numbers()
    println(arrayOf("Joe,Banksmizo,Phionaoloo,Blessings"))
    robotServingDrinks(6)
    multiplication()


}
fun numbers(){
    for(numbers in 1..100){
        if( (numbers% 2)!=0)
println(numbers)
    }
}
fun name(names:Array<String>):Int{
 var numb =0
    names.forEach { s->
        if (s.length >5){
            numb++
        }
    }
    return numb
}
fun robotServingDrinks(age:Int){
    if (age<=6){
        println("Glass of milk")
    }
    else{
        println("Cocacola")
    }
}
fun multiplication(){
    for (number in 1..100){
        if (number % 3==0){
            println("Fizz")
        }
        else if (number % 5 ==0){
            println("Buzz")
        }
        if (number%3==0 &&  number%5==0){
            println("FizzBuzz")
        }
    }
}