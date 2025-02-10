package net.kwmt27.abc392.B

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
10 3
3 9 2""".trimMargin()
        val output = """
7
1 4 5 6 7 8 10""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
6 6
1 3 5 2 4 6""".trimMargin()
        val output = "0\n"
        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
9 1
9""".trimMargin()
        val output = """
8
1 2 3 4 5 6 7 8""".trimMargin()

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
