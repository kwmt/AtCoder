package net.kwmt27.atcoder_beginners_selection

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class PracticeA {
    @Test
    fun sample1() {
        val input = """
1
2 3
test""".trimMargin()
        val output = """
6 test""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
72
128 256
myonmyon""".trimMargin()
        val output = """
456 myonmyon""".trimMargin()

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
