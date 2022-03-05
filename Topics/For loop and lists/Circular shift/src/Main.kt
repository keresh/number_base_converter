const val NUM_ZERO = 0

fun main() {
    val n = readLine()!!.toInt()
    val numbers: MutableList<Int> = mutableListOf()
    for (i in NUM_ZERO until n) numbers.add(readLine()!!.toInt())
    numbers.add(NUM_ZERO, numbers[numbers.lastIndex])
    numbers.removeAt(numbers.lastIndex)
    println(numbers.joinToString(" "))
}