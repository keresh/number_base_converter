fun main() {
    val n = readLine()!!.toInt()
    var min = 0
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        if (i == 1) min = num
        if (num < min) min = num
    }
    println(min)
}