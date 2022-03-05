import java.math.BigInteger

fun main() {
    val n1 = readLine()!!.toBigInteger()
    val n2 = readLine()!!.toBigInteger()
    println(maxOfTwo(n1, n2))
}

fun maxOfTwo(a: BigInteger, b: BigInteger): BigInteger {
    return if (a > b) {
        a
    } else {
        b
    }
}