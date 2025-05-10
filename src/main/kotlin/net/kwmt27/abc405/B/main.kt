package net.kwmt27.abc405.B

fun main() {

    val (N, M) = readln().split(" ").map { it.toInt() }
    val An: List<Int> = readln().split(" ").map { it.toInt() }

    val target = IntRange(1, M).toList()
    var count = 0

    var newAn = An
    for (i in 0 until N + 1) {
        if (newAn.toSortedList() == target) {
            newAn = newAn.dropLast(1)
            ++count
        } else {
            println(count)
            return
        }
    }
}

private fun List<Int>.toSortedList(): List<Int> = toSet().sorted().toList()