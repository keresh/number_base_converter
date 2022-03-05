package converter

import java.math.BigInteger
import java.math.BigDecimal
import java.math.MathContext

const val COMMAND_QUIT = "/exit"
const val COMMAND_BACK = "/back"
const val ROUND = 5

fun main() {
    do {
        println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val input = readLine()!!
        if (input != COMMAND_QUIT) {
            do {
                val base = input.split(' ').map { it.toInt() }
                println("Enter number in base ${base[0]} to convert to base ${base[1]} (To go back type /back)")
                val num = readLine()!!
                if (num != COMMAND_BACK) {
                    val result: String = if (num.contains('.')) {
                        val fraction = num.split('.')
                        val integerPartToDecimal = convertToDecimal(fraction[0], base[0], 1)
                        val fractionalPartToDecimal = convertToDecimalFromFractional(fraction[1], base[0], -1)
                        val convertedIntegerPart = convertToAny(integerPartToDecimal, base[1].toBigInteger())
                        val convertedFractionalPart = convertFractionalPartToAny(fractionalPartToDecimal, base[1].toBigInteger())
                        "$convertedIntegerPart.$convertedFractionalPart"
                    } else {
                        val decimalNum = convertToDecimal(num, base[0], 1)
                        convertToAny(decimalNum, base[1].toBigInteger())
                    }
                    println("Conversion result: $result")
                    println()
                }
            } while (num != COMMAND_BACK)
        }
    } while (input != COMMAND_QUIT)
}

fun convertToAny(source: String, base: BigInteger): String {
    val digits: MutableList<Int> = mutableListOf()
    var quotient = BigInteger(source)
    while (quotient >= base) {
        digits.add((quotient % base).toInt())
        quotient /= base
    }
    digits.add(quotient.toInt())
    return digits.reversed().joinToString("") { it.digitToChar(base.toInt()).toString() }
}

fun convertFractionalPartToAny(source: String, targetBase: BigInteger): String {
    val digits: MutableList<Int> = mutableListOf()
    var quotient = BigDecimal(source)
    for (i in 1..ROUND) {
        if (quotient == BigDecimal.ZERO) {
            digits.add(0)
            continue
        }
        val numParts = (quotient * targetBase.toBigDecimal()).toString().split(".")
        digits.add(numParts[0].toInt())
        if (numParts[1].toBigDecimal() == BigDecimal.ZERO) break
        quotient = BigDecimal("0.${numParts[1]}")
    }
    while (digits.size < 5) digits.add(0)
    return digits.joinToString("") { it.digitToChar(targetBase.toInt()).toString() }
}

fun convertToDecimal(text: String, base: Int, multiply: Long): String {
    var num = BigInteger.ZERO
    var mul = multiply
    for (element in text.reversed()) {
        num += BigInteger.valueOf(mul * element.digitToInt(base))
        mul *= base
    }
    return num.toString()
}

fun convertToDecimalFromFractional(text: String, base: Int, index: Long): String {
    if (doesStringContainsOnlyZeros(text)) return "00000"
    var numDec: BigDecimal = BigDecimal.ZERO
    var i = index
    for (element in text) {
        numDec += (element.digitToInt(base).toBigDecimal() * base.toBigDecimal().pow(i.toInt(), MathContext.DECIMAL64))
        i--
    }
    return numDec.toString()
}

fun doesStringContainsOnlyZeros(text: String): Boolean {
    var result = true
    for (c in text) if (c != '0') result = false
    return result
}