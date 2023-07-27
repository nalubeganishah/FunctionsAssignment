

fun main() {
    //Write a function that has  three parameters; two doubles and one character
    //(*,+,-,/) and check if the third parameter
    //==* it will multiply the two doubles
    //==+ it will add the two numbers
    //==- it will subtract the two numbers
    //==/ it will divide the two numbers
    val firstNumber = 30.0
    val secondNumber = 40.0
    print("Enter a character..")
    val character = readln()
    //val character => ("*", "+", "-", "/")
    val result = calculateNumbersUsingCharacter (firstNumber, secondNumber, character)
    println(result)


}
fun calculateNumbersUsingCharacter(firstNumber: Double, secondNumber: Double, character: String):Int {
    if (character == "*") {
        (firstNumber * secondNumber)
        return (30 * 40)
    } else if (character == "+") {
        firstNumber + secondNumber
        return(30 + 40)
    } else if (character == "-") {
        firstNumber - secondNumber
        return (30 - 40)
    } else if (character == "/") {
        firstNumber / secondNumber
        return (30 / 40)

    } else {
        return 0
    }
}
