package net.kwmt27.abc387.B

fun main() {
    val X = readln().toInt()
    val grid = mutableListOf<List<Int>>()
    for (i in (1..9)) {
        val list = mutableListOf<Int>()
        for (j in (1..9)) {
            list.add(i * j)
        }
        grid.add(list)
    }
    val gridSum = grid.sumOf {
        it.sum()
    }

    var foundCount = 0
    for (column in grid) {
        for (row in column) {
            if (row == X) {
                foundCount += 1
            }
        }
    }
    val result = if (foundCount > 0) {
        gridSum - (X * foundCount)
    } else {
        gridSum
    }

    println(result)
}