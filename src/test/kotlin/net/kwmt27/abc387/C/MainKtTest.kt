package net.kwmt27.abc387.C

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
97 210""".trimMargin()
        val output = """
6""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
1000 9999""".trimMargin()
        val output = """
2025""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
252509054433933519 760713016476190692""".trimMargin()
        val output = """
221852052834757""".trimMargin()

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
