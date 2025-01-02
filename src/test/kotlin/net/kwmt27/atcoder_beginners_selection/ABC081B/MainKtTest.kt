package net.kwmt27.atcoder_beginners_selection.ABC081B

import net.kwmt27.net.kwmt27.atcoder_beginners_selection.ABC081B.main
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {
    @Test
    fun sample1() {
        val input = """
3
8 12 40""".trimMargin()
        val output = """
2""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample2() {
        val input = """
4
5 6 8 10""".trimMargin()
        val output = """
0""".trimMargin()

        judge(input, output)
    }

    @Test
    fun sample3() {
        val input = """
6
382253568 723152896 37802240 379425024 404894720 471526144""".trimMargin()
        val output = """
8""".trimMargin()

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
