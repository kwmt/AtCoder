package net.kwmt27.abc405.C

import java.math.BigInteger

fun main() {
    val N = readln().toInt()
    val An: List<BigInteger> = readln().split(" ").map { it.toBigInteger() }
//
//    N = 3
//    i = 1 -> j = 2, 3
//    i = 2 -> j = 3
//    i = 3 ->

    var result: BigInteger = BigInteger.ZERO
    for (i in 1 until N + 1) {
        for (j in i + 1 until N + 1) {
            result = result.plus(An[i - 1] * An[j - 1])

            // i = 1のとき
            // result = result + A1 * A2
            // result = result + A1 * A3

            // i = 2 のとき
            // result = result + A2 * A3

        }
    }

    println(result)
}