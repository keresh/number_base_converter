fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var printedNumber = b
    if (a > b) printedNumber = a
    println(printedNumber)
}