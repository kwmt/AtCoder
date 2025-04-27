package net.kwmt27.abc403.C

fun main() {
    val (N, M, Q) = readln().split(" ").map { it.toInt() }
    val queries = (1..Q).map {
        val inputs: List<Int> = readln().split(" ").map { it.toInt() }
        inputs
    }
    val userPermissionMap = (1..N).associateWith {
        mutableMapOf<Int, MutableList<Boolean>>().withDefault { key ->
            MutableList(M ) { false }
        }.getValue(it)
    }

    for (query in queries) {
        val command = query[0]
        when (command) {
            1 -> {
                val X = query[1]
                val Y = query[2]

                userPermissionMap[X]?.set(Y - 1, true)
            }

            2 -> {
                val X = query[1]

                val allPage = userPermissionMap[X]
                allPage?.forEachIndexed { index, page ->
                    userPermissionMap[X]?.set(index, true)
                }
            }

            3 -> {
                val X = query[1]
                val Y = query[2]
                val isPermit = userPermissionMap[X]?.get(Y - 1)
                println(if (isPermit == true) "Yes" else "No")
            }
        }
    }
}