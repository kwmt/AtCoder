package net.kwmt27.atcoder_beginners_selection.ABC085B

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC085B.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
4
10
8
8
6""".trimMargin()
        val output = """
3""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
3
15
15
15""".trimMargin()
        val output = """
1""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
7
50
30
50
100
50
80
30""".trimMargin()
        val output = """
4""".trimMargin()

        judge(input, output)
    }

    private fun judge(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        main()

        Assertions.assertEquals(output + System.lineSeparator(), sysOut.toString())
    }
}
