package net.kwmt27.abc390.A

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
1 2 4 3 5""".trimMargin()
        val output = """
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
5 3 2 4 1""".trimMargin()
        val output = """
No""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
1 2 3 4 5""".trimMargin()
        val output = """
No""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample4() {
        val input = """
2 1 3 4 5""".trimMargin()
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
