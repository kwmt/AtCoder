package net.kwmt27.abc389.B

import java.math.BigInteger

fun main() {
    val X = readln()

    var i: BigInteger = BigInteger.valueOf(1)
    var nextNumber: BigInteger = BigInteger.valueOf(0)
    var element: BigInteger = BigInteger.valueOf(1)
    while (true) {
        nextNumber = i.plus(BigInteger.valueOf(1))
        element = element.multiply(nextNumber)
        if (element.toString() == X) {
            break
        }
        i = i.plus(BigInteger.valueOf(1))
    }

    println(nextNumber)
}