package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC086A

// https://atcoder.jp/contests/abs/tasks/abc086_a


fun main() {
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }
    val product = inputs[0] * inputs[1]
    val result = if (product % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
    println(result)
}