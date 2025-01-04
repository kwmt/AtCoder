package net.kwmt27.abc387.B

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
1""".trimMargin()
        val output = """
2024""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
11""".trimMargin()
        val output = """
2025""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
24""".trimMargin()
        val output = """
1929""".trimMargin()

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
