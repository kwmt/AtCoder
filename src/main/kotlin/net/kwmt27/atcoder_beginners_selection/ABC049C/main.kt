package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC049C

fun main() {
    val S = readln()
    val words = listOf("dream", "dreamer", "erase", "eraser").reversed()
    var s = S

    for (word in words) {
        s = s.replace(word, "")
    }

    val result = if (s.length == 0) {
        "YES"
    } else {
        "NO"
    }

    println(result)
}

