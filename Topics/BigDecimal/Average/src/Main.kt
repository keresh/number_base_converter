import java.math.BigDecimal
import java.math.RoundingMode

const val NUM_THREE = 3

fun main() {
    val a = BigDecimal(readLine()!!)
    val b = BigDecimal(readLine()!!)
    val c = BigDecimal(readLine()!!)
    val result = (a + b + c) / BigDecimal(NUM_THREE)
    println(result.setScale(0, RoundingMode.HALF_DOWN))
}