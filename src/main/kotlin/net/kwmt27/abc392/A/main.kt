package net.kwmt27.abc392.A

fun main() {
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }

    listOf(listOf(0, 1, 2), listOf(0, 2, 1), listOf(2, 1, 0), listOf(2, 0, 1)).forEach { (i1, i2, i3) ->
        val b1 = inputs[i1]
        val b2 = inputs[i2]
        val b3 = inputs[i3]

        if (b1 * b2 == b3) {
            println("Yes")
            return
        }
    }

    println("No")
}