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

    var ans: BigInteger = BigInteger.ZERO
    var sum: BigInteger = BigInteger.ZERO
    for (i in 0 until N) {
        ans += sum.times(An[i])
        sum += An[i]
    }

    println(ans)
}