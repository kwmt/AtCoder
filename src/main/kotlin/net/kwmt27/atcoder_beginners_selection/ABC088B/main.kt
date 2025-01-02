package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC088B

fun main() {
    val N = readln().toInt()
    val a_N: List<Int> = readln().split(" ").map { it.toInt() }

    val Alice = mutableListOf<Int>()
    val Bob = mutableListOf<Int>()

    var tempA_N = a_N
    for (i in 1..N) {
        if (i % 2 != 0) {
            val result = getCard(tempA_N) ?: break
            tempA_N = result.first
            val card = result.second
            Alice.add(card)
        } else {
            val result = getCard(tempA_N) ?: break
            tempA_N = result.first
            val card = result.second
            Bob.add(card)
        }
    }
    println(Alice.sum() - Bob.sum())
}

private fun getCard(a_N: List<Int>): Pair<MutableList<Int>, Int>? {
    val max = a_N.maxOrNull() ?: return null
    val indexOfMax = a_N.indexOf(max)
    val mutableAn = a_N.toMutableList()
    mutableAn.removeAt(indexOfMax)
    return mutableAn to max
}