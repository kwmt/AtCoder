package net.kwmt27.abc403.A

fun main() {
    val n = readln().toInt()
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }

    val result = inputs.filterIndexed { index, _ ->
        (index + 1) % 2 != 0
    }.sum()
    println(result)
}