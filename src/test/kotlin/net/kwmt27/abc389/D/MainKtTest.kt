package net.kwmt27.abc389.D

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
2""".trimMargin()
        val output = """
5""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
4""".trimMargin()
        val output = """
37""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
26""".trimMargin()
        val output = """
2025""".trimMargin()

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
