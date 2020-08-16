import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import integerToRoman.Solution

class IntegerToRomanTests {
    @ParameterizedTest
    @CsvSource("III,3","IV,4","IX,9","LVIII,58","MCMXCIV,1994")
    fun IntegerToRomanTest(e: String, n: Int) {
        assertEquals(e, Solution.intToRoman(n))
    }
}