package net.kwmt27.abc390.A

fun main() {
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }
    for (i in 0..(inputs.size - 2)) {
        val sortedInputs = sort(inputs, i)

        if (check(sortedInputs)) {
            println("Yes")
            return
        }
    }
    println("No")


}

private fun check(target: List<Int>): Boolean {
    val actual = target.joinToString(" ")
    return actual == EXPECTED_VALUE
}

private fun sort(target: List<Int>, currentIndex: Int): List<Int> {
    val mutableList = target.toMutableList()
    val current = mutableList[currentIndex]
    val next = mutableList[currentIndex + 1]
    mutableList[currentIndex] = next
    mutableList[currentIndex + 1] = current

    return mutableList
}

private const val EXPECTED_VALUE = "1 2 3 4 5"