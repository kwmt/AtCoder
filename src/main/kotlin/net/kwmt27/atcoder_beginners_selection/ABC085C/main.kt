package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC085C

fun main() {
    val inputs: List<Int> = readln().split(" ").map { it.toInt() }
    val N = inputs[0]
    val Y = inputs[1]

    val result = find(N, Y)

    if (result.isEmpty()) {
        println("-1 -1 -1")
    } else {
        println(result)
    }
}

private fun find(N: Int, Y: Int): String {
    var result = ""
    for (x in 0..N) {
        for (y in 0..N) {
            for (z in 0..(N - (x + y))) {
                if (result.isNotEmpty()) return result
                if (x + y + z != N) continue
                val total = 10000 * x + 5000 * y + 1000 * z
                if (total == Y) {
                    result = "$x $y $z"
                }
            }
        }
    }
    return result
}