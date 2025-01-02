package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC087B

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val x = readln().toInt()

    var count = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                val sum = 500 * i + 100 * j + 50 * k
                if (sum == x) {
                    count += 1
                    break
                }
            }
        }
    }
    println(count)
}