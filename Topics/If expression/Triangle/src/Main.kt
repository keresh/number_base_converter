fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val isTriangle = if (a + b > c &&
        b + c > a &&
        a + c > b
    ) "YES" else "NO"
    println(isTriangle)
}