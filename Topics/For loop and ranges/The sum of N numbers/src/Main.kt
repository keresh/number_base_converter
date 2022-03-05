fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    repeat(n) {
        sum += readLine()!!.toInt()
    }
    print(sum)
}