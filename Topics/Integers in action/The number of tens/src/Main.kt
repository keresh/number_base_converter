const val NUM_HUNDRED = 100
const val NUM_TEN = 10

fun main() {
    val num = readLine()!!.toInt()
    println(num % NUM_HUNDRED / NUM_TEN)
}