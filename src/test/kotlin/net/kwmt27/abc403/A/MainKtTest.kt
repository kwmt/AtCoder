package net.kwmt27.abc403.A

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
7
3 1 4 1 5 9 2""".trimMargin()
        val output = """
14""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
1
100""".trimMargin()
        val output = """
100""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
14
100 10 1 10 100 10 1 10 100 10 1 10 100 10""".trimMargin()
        val output = """
403""".trimMargin()

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
