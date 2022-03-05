import kotlin.math.abs

fun main() {
    val (x1, y1) = readLine()!!.split(' ').map { it.toInt() }
    val (x2, y2) = readLine()!!.split(' ').map { it.toInt() }

    val isPossible = if (abs(y2 - y1) == 1 && abs(x2 - x1) == 2 ||
        abs(y2 - y1) == 2 && abs(x2 - x1) == 1
    ) "YES" else "NO"
    println(isPossible)
}