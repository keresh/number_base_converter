fun main() {
    val num = readLine()!!.toInt()
    val info = if (num < 0) "negative" else if (num > 0) "positive" else "zero"
    println(info)
}