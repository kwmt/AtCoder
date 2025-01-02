package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC083B

fun main() {
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }
    val N = inputs[0]
    val A = inputs[1]
    val B = inputs[2]

    val total = (1..N).map { i ->
        val totalNumberOfEachDigit = i.toString().map { it.digitToInt() }.sum()
        if (totalNumberOfEachDigit in A..B) {
            i
        } else {
            0
        }
    }.sum()

    println(total)
}