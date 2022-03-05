fun main() {
    val n = readLine()!!.toInt()
    val numbers: MutableList<Int> = mutableListOf()
    for (i in 0 until n) numbers.add(readLine()!!.toInt())
    val m = readLine()!!.toInt()
    println(
        if (numbers.contains(m)) {
            "YES"
        } else {
            "NO"
        }
    )
}