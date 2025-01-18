package net.kwmt27.abc387.C

import net.kwmt27.abc389.C.BigIntegerRange
import net.kwmt27.abc389.C.BigIntegerRangeIterator
import java.math.BigInteger

fun main() {
    val (L, R) = readln().split(" ").map { it.toBigInteger() }

    val resultList = mutableListOf<Int>()
    var memoFirst = 0
    for (num in L..R) {
        val numList = num.toString().map { it.digitToInt() }
        val firstDigit = numList.subList(0, 1).first()
        if (memoFirst == firstDigit) {
            continue
        }
        memoFirst = firstDigit
        resultList.add((numList.size - 1) * firstDigit)

    }
    println(resultList.size)


}

private fun extracted(start: BigInteger, end: BigInteger, resultList: MutableList<BigInteger>) {
    for (num in start..end) {
        val numList = num.toString().map { it.digitToInt() }

        val firstDigit = numList.subList(0, 1).first()
        val remainDigitList = numList.subList(1, numList.size)

        if (firstDigit <= remainDigitList.first()) {
            val newNumList = listOf(firstDigit + 1) + List(remainDigitList.size) { 0 }
            val newNum = newNumList.joinToString("").toBigInteger()
            extracted(newNum, end, resultList)
            break

        }

        val maxOfRemainDigitList = remainDigitList.max()

        if (firstDigit <= maxOfRemainDigitList) {
            val s = num.plus(10.toBigInteger()) - numList.last().toBigInteger()
            extracted(s, end, resultList)

            break
        }
        resultList.add(num)
    }
}

operator fun BigInteger.rangeTo(other: BigInteger) =
    BigIntegerRange(this, other)

class BigIntegerRange(
    override val start: BigInteger,
    override val endInclusive: BigInteger
) : ClosedRange<BigInteger>, Iterable<BigInteger> {
    override operator fun iterator(): Iterator<BigInteger> =
        BigIntegerRangeIterator(this)
}

class BigIntegerRangeIterator(
    private val range: ClosedRange<BigInteger>
) : Iterator<BigInteger> {
    private var current = range.start

    override fun hasNext(): Boolean =
        current <= range.endInclusive

    override fun next(): BigInteger {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        return current++
    }
}
