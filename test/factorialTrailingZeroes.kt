import factorialTrailingZeroes.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FactorialTrailingZeroesTests {
    @ParameterizedTest
    @CsvSource("0;3", "1;5", "7;30", "12;50", "452137076;1808548329", delimiter = ';')
    fun FactorialTrailingZeroesTest(e: Int, x: Int) {
        assertEquals(e, Solution.trailingZeroes(x))
    }

    @ParameterizedTest
    @CsvSource("0;3", "1;5", "7;30", "12;50", "452137076;1808548329", delimiter = ';')
    fun FactorialTrailingZeroesSimpleTest(e: Int, x: Int) {
        assertEquals(e, Solution.trailingZerosSimple(x))
    }
}