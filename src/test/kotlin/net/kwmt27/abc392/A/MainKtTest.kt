package net.kwmt27.abc392.A

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
3 15 5""".trimMargin()
        val output = """
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
5 3 2""".trimMargin()
        val output = """
No""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
3 3 9""".trimMargin()
        val output = """
Yes""".trimMargin()

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
