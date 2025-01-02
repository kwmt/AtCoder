package net.kwmt27.atcoder_beginners_selection.ABC085C

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC085C.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
9 45000""".trimMargin()
        val output = """
0 9 0""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
20 196000""".trimMargin()
        val output = """
-1 -1 -1""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
1000 1234000""".trimMargin()
        val output = """
2 54 944""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample4() {
        val input = """
2000 20000000""".trimMargin()
        val output = """
2000 0 0""".trimMargin()

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
