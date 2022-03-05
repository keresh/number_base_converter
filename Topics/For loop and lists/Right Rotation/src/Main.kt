const val NUM_ZERO = 0

fun main() {
    val n = readLine()!!.toInt()
    val numbers: MutableList<Int> = mutableListOf()
    for (i in NUM_ZERO until n) numbers.add(readLine()!!.toInt())
    val rotate = readLine()!!.toInt()
    repeat(rotate % numbers.size) {
        numbers.add(NUM_ZERO, numbers[numbers.lastIndex])
        numbers.removeAt(numbers.lastIndex)
    }
    println(numbers.joinToString(" "))
}