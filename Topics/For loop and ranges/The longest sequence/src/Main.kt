fun main() {
    val n = readLine()!!.toInt()
    var previousNum = 1
    var previousSequence = 0
    var sequence = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num >= previousNum) {
            ++sequence
            if (sequence > previousSequence) previousSequence = sequence
        } else {
            if (sequence > previousSequence) previousSequence = sequence
            sequence = 1
        }
        previousNum = num
    }
    println(previousSequence)
}