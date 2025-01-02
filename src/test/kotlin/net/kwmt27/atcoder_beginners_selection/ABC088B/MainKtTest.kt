package net.kwmt27.atcoder_beginners_selection.ABC088B

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC088B.main
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
3 1""".trimMargin()
        val output = """
2""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
3
2 7 4""".trimMargin()
        val output = """
5""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
4
20 18 2 18""".trimMargin()
        val output = """
18""".trimMargin()

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
