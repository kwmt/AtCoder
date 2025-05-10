package net.kwmt27.abc405.B

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
5 3
3 2 3 1 2""".trimMargin()
        val output = """
2""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
4 3
1 3 1 3""".trimMargin()
        val output = """
0""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
10 4
1 3 3 4 2 1 3 1 2 4""".trimMargin()
        val output = """
6""".trimMargin()

        judge(input, output)
    }
    @Test
    fun sample4() {
        val input = """
1 1
1""".trimMargin()
        val output = """
1""".trimMargin()

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
