package net.kwmt27.abc403.B

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
tak??a?h?
nashi""".trimMargin()
        val output = """
Yes""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
??e??e
snuke""".trimMargin()
        val output = """
No""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
????
aoki""".trimMargin()
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
