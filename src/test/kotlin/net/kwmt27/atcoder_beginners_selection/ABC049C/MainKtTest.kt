package net.kwmt27.atcoder_beginners_selection.ABC049C

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC049C.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
erasedream""".trimMargin()
        val output = """
YES""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
dreameraser""".trimMargin()
        val output = """
YES""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
dreamerer""".trimMargin()
        val output = """
NO""".trimMargin()

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
