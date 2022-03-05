fun main() {
    val n = readLine()!!.toInt()
    val numbers: MutableList<Int> = mutableListOf()
    repeat(n) {
        numbers.add(readLine()!!.toInt())
    }
    println(biggestListSum(numbers))
}

fun biggestListSum(list: MutableList<Int>): Int {
    var multiply = 0
    if (list.size == 1) return list.first()
    for (i in 0 until list.size) {
        for (j in 0 until list.size) {
            if (i == j) continue
            if (list[i] * list[j] > multiply) {
                multiply = list[i] * list[j]
            }
        }
    }
    return multiply
}