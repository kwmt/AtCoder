package net.kwmt27.atcoder_beginners_selection.ABC081A

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC081A.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
101""".trimMargin()
        val output = """
2""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
000""".trimMargin()
        val output = """
0""".trimMargin()

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
