package net.kwmt27.abc405.C

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
3
4 2 3""".trimMargin()
        val output = """
26""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
2
9 45""".trimMargin()
        val output = """
405""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
10
7781 8803 8630 9065 8831 9182 8593 7660 7548 8617""".trimMargin()
        val output = """
3227530139""".trimMargin()

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
