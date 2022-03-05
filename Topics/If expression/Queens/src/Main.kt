import kotlin.math.abs

fun main() {
    val (x1, y1) = readLine()!!.split(' ').map { it.toInt() }
    val (x2, y2) = readLine()!!.split(' ').map { it.toInt() }
    val isPossible = if (x1 == x2 || y1 == y2 ||
        abs(x1 - x2) == abs(y1 - y2)
    ) "YES" else "NO"
    println(isPossible)
}