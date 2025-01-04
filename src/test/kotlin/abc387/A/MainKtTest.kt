package abc387.A

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
20 25""".trimMargin()
        val output = """
2025""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
30 25""".trimMargin()
        val output = """
3025""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
45 11""".trimMargin()
        val output = """
3136""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample4() {
        val input = """
2025 1111""".trimMargin()
        val output = """
9834496""".trimMargin()

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
