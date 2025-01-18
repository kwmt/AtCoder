package net.kwmt27.abc389.C

import java.util.LinkedList
import java.util.Queue

data class Line(
    val pos: Int = 0,
    val length: Int = 0
)

fun main() {
    val Q = readln().toInt()
    val queries = (1..Q).map {
        val inputs: List<Int> = readln().split(" ").map { it.toInt() }
        inputs
    }

    if (queries.map { it.first() }.none { it == 3 }) {
        println()
        return
    }


    var queue: Queue<Line> = LinkedList()
    for (query in queries) {
        val type = query.first()
        when (type) {
            1 -> {
                val l = queue.toList().lastOrNull() ?: Line()
                val length = query[1]
                queue.add(Line(l.pos + l.length, length))
            }

            2 -> {
                val l = queue.poll()
                val updateQueue = queue.toList().map {
                    it.copy(
                        pos = it.pos - l.length
                    )
                }
                queue = LinkedList(updateQueue)
            }

            3 -> {
                val k = query[1]
                val kLine = queue.toList()[k - 1]
                println(kLine.pos)
            }
        }
    }
}