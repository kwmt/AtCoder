package net.kwmt27.abc389.C

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
1 5
1 7
3 2
1 3
1 4
2
3 3""".trimMargin()
        val output = """
5
10""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
3
1 1
2
1 3""".trimMargin()
        val output = """
""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
10
1 15
1 10
1 5
2
1 5
1 10
1 15
2
3 4
3 2""".trimMargin()
        val output = """
20
5""".trimMargin()

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
