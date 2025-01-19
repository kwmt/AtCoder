package net.kwmt27.abc389.D

fun main() {
    val R = readln().toInt()


    var count = 0
    for (i in 0..R) {
        for (j in 0..R) {
            if (
                i + 0.5 <= R && j + 0.5 <= R &&
                i + 0.5 <= R && j - 0.5 <= R &&
                i - 0.5 <= R && j + 0.5 <= R &&
                i - 0.5 <= R && j - 0.5 <= R
            ) {
                count += 1
            }

        }

    }
    println(count + 1)

}