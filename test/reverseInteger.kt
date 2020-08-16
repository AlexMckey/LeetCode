import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import reverseInteger.Solution

class ReverseIntegerTests {
    @ParameterizedTest
    @CsvSource("123,321","-321,-123","21,120","0,1534236469")
    fun SimpleTest(e: String, v: String) {
        assertEquals(e.toInt(), Solution.reverse(v.toInt()))
    }
}