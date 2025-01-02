package net.kwmt27.atcoder_beginners_selection.ABC086A

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC086A.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
3 4""".trimMargin()
        val output = """
Even""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
1 21""".trimMargin()
        val output = """
Odd""".trimMargin()

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
