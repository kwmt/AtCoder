package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC085B

fun main() {
    val input = generateSequence(::readLine).toList().map { it.toInt() }
    val temp = input.toMutableList()
    val N = temp.removeAt(0)
    val d_N = temp
    println(d_N.toSet().size)
}