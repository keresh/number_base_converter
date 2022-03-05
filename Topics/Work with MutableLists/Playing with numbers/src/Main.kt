const val NUM_ZERO = 0
const val NUM_TWO = 2

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here   
    val sum = numbers.sum()
    numbers.add(NUM_ZERO, sum)
    numbers.removeAt(numbers.size - NUM_TWO)
    // do not touch the lines below
    println(numbers.joinToString(" "))
}