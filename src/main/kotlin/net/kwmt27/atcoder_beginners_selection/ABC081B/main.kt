package net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC081B

fun main() {
    val n = readln().toInt()
    val a_n: List<Int> = readln().split(" ").map { it.toInt() }

    // 1. a_n がすべて偶数か確認
    // 2
    // すべて偶数なら
    // a_nをすべて2で割り、a_nを置き換える
    // 回数を+1する
    // 奇数が１つでもあれば
    // 回数を返す


    val (resultAn, resultCount) = checkEven(a_n, 0)
    println(resultCount)

}

private fun checkEven(a_n: List<Int>, count: Int): Pair<List<Int>, Int> {
    var isAllEven = true
    a_n.forEach {
        isAllEven = isAllEven && (it % 2 == 0)
    }

    return if (isAllEven) {
        checkEven(a_n.map { it / 2 }, count + 1)
    } else {
        a_n to count
    }
}