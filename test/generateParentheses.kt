import generateParentheses.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class GenerateParenthesesTests {
    @ParameterizedTest
    @CsvSource("((())),(()()),(())(),()(()),()()();3","(()),()();2","();1", delimiter = ';')
    fun GenerateParenthesesTests(e: String, v: Int) {
        assertArrayEquals(e.split(",").sorted().toTypedArray(),
            Solution.generateParenthesis(v).sorted().toTypedArray())
    }
}