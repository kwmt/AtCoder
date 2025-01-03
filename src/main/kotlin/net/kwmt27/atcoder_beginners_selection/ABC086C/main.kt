package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC086C

import kotlin.math.abs

private data class Pos(
    val t: Int,
    val x: Int,
    val y: Int,
)

fun main() {
    val n = readln().toInt()
    val inputs: List<Pos> = (1..n)
        .map { readln().split(" ").map { it.toInt() } }
        .map { (t, x, y) -> Pos(t, x, y) }.toMutableList().apply {
            add(0, Pos(0, 0, 0))
        }

    for (i in 0..(n - 1)) {
        val nextPos = inputs[i + 1]
        val currentPos = inputs[i]
        val dt = nextPos.t - currentPos.t
        val distance = abs(nextPos.x - currentPos.x) + abs(nextPos.y - currentPos.y)
        if (distance > dt || (distance - dt) % 2 != 0) {
            println("No")
            return
        }
    }

    println("Yes")
}
