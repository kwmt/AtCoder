package net.kwmt27.abc389.A

fun main() {
    val inputs: List<Int> = readln().split("x").map { it.toInt() }
    var element = 1
    for (input in inputs) {
        element *= input
    }
    println(element)
}