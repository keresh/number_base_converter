fun main() {
    val (name, surname, age) = readLine()!!.split(' ')
    println("${name[0]}. $surname, $age years old")
}