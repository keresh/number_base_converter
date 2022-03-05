fun main() {
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()
    val (result, reminder) = a.divideAndRemainder(b)
    println("$a = $b * $result + $reminder")
}