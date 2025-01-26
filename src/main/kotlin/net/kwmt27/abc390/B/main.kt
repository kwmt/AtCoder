package net.kwmt27.abc390.B

fun main() {

    val n = readln().toInt()
    val inputs: List<Long> = readln().split(" ").map { it.toLong() }


    for (i in 0..(inputs.size - 3)) {
        val a = inputs[i]
        val b = inputs[i + 1]
        val c = inputs[i + 2]

        if (b * b != a * c) {
            println("No")
            return
        }
    }
    println("Yes")
}