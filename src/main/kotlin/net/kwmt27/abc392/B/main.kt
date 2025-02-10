package net.kwmt27.abc392.B

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val A: List<Int> = readln().split(" ").map { it.toInt() }

    val result = mutableListOf<Int>()
    for (i in 1..N) {

        if (A.contains(i)) {
            continue
        }
        result.add(i)

    }
    println(result.size)
    println(result.joinToString(" "))
}