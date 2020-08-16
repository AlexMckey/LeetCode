import divideTwoIntegers.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class DivideTwoIntegersests {
    @ParameterizedTest
    @CsvSource("3;10;3","-2;7;-3","2;-7;-3", "1;1;1",
        "2147483647;-2147483648;-1", "-2147483648;-2147483648;1", delimiter = ';')
    fun DivideTwoIntegersTest(e: Int, x: Int, y: Int) {
        assertEquals(e, Solution.divide(x,y))
    }

    @ParameterizedTest
    @CsvSource("3;10;3","-2;7;-3","2;-7;-3", "1;1;1",
        "2147483647;-2147483648;-1", "-2147483648;-2147483648;1", delimiter = ';')
    fun DivideTwoIntegersFasterTest(e: Int, x: Int, y: Int) {
        assertEquals(e, Solution.divideFaster(x,y))
    }
}