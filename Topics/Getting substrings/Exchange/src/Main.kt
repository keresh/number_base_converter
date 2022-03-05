fun main() {
    val s: String = readLine()!!
    val first: Char = s[0]
    val last: Char = s[s.lastIndex]
    val s2: String = s.substring(1, s.lastIndex)
    println("$last$s2$first")
}