package net.kwmt27.abc405.A

fun main() {

    val (R, X) = readln().split(" ").map { it.toInt() }

    val DIV1 = IntRange(1600, 2999)
    val DIV2 = IntRange(1200, 2399)

    when (X) {
        1 -> {
            DIV1.contains(R)
        }

        2 -> {
            DIV2.contains(R)
        }

        else -> throw Exception()
    }.run {
        println(if (this) "Yes" else "No")
    }
}