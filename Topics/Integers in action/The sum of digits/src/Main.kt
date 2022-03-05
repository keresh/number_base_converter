const val DIV = 10

fun main() {
    val inputNumber = readLine()!!.toInt()
    println(inputNumber % DIV + inputNumber / DIV % DIV + inputNumber / DIV / DIV)
}