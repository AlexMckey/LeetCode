import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import sqrtInInt.Solution

class SqrtInIntTests {
    @ParameterizedTest
    @CsvSource("2;4","2;8", delimiter = ';')
    fun SqrtInIntTests(e: Int, x: Int) {
        assertEquals(e, Solution.mySqrt(x))
    }
}