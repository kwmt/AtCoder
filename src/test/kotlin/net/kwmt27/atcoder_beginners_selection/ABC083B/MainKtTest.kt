package net.kwmt27.atcoder_beginners_selection.ABC083B

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC083B.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
20 2 5""".trimMargin()
        val output = """
84""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
10 1 2""".trimMargin()
        val output = """
13""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
100 4 16""".trimMargin()
        val output = """
4554""".trimMargin()

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
