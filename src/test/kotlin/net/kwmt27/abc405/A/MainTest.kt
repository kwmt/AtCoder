package net.kwmt27.abc405.A

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
2000 1""".trimMargin()
        val output = """
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
1000 1""".trimMargin()
        val output = """
No""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
1500 2""".trimMargin()
        val output = """
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample4() {
        val input = """
2800 2""".trimMargin()
        val output = """
No""".trimMargin()

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
