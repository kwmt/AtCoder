package net.kwmt27.abc387.A

import kotlin.math.pow

fun main() {
    val (A, B) = readln().split(" ").map { it.toInt() }
    val result = (A + B).toDouble().pow(2.toDouble())
    println(result.toInt())
}