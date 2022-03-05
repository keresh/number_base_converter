fun main() {
    val n = readLine()!!.toInt()
    val numbers: MutableList<Int> = mutableListOf()
    for (i in 0 until n) numbers.add(readLine()!!.toInt())
    val (p, m) = readLine()!!.split(' ').map { it.toInt() }
    val pair: MutableList<Int> = mutableListOf<Int>(p, m)
    var result = "YES"
    for (element in numbers.zipWithNext().map { it.toList() }) {
        if (element.containsAll(pair)) {
            result = "NO"
            break
        }
    }
    println(result)
}