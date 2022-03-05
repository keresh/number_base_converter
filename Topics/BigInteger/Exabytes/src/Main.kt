import java.math.BigInteger

const val NUM_SIXTY_THREE = 63

fun main() {
    val n = readLine()!!.toInt()
    var result = BigInteger.valueOf(0)
    repeat(n) {
        result += BigInteger.TWO.pow(NUM_SIXTY_THREE)
    }
    println(result)
}