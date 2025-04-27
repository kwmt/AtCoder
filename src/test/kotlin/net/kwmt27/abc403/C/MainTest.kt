package net.kwmt27.abc403.C

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
2 3 5
1 1 2
3 1 1
3 1 2
2 2
3 2 3""".trimMargin()
        val output = """
No
Yes
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
5 5 10
2 2
3 4 4
1 1 1
1 4 1
1 4 2
1 4 4
1 2 4
3 3 2
3 5 4
3 2 1""".trimMargin()
        val output = """
No
No
No
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
