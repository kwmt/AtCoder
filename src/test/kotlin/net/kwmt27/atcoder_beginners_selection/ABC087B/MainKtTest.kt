package net.kwmt27.atcoder_beginners_selection.ABC087B

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC087B.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
2
2
2
100""".trimMargin()
        val output = """
2""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
5
1
0
150""".trimMargin()
        val output = """
0""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
30
40
50
6000""".trimMargin()
        val output = """
213""".trimMargin()

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
