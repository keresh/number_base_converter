fun main() {
    val inputText = readLine()!!
    val inputNumber = readLine()!!.toInt()
    println("Symbol # $inputNumber of the string \"$inputText\" is '${inputText[inputNumber - 1]}'")
}