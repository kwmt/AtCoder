package net.kwmt27.atcoder_beginners_selection

fun main() {
    val a = readln().toInt()
    val (b, c) = readln().split(" ").map { it.toInt() }
    val s = readln()
    val result = "${a + b + c} $s"
    println(result)
}