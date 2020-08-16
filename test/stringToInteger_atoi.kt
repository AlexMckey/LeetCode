import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import stringToInteger_atoi.Solution

class StringToInteger_atoiTests {
    @ParameterizedTest
    @CsvSource("42;42", "-42;   -42", "4193;4193 with words", "0;words and 987","-2147483648;-91283472332", delimiter = ';')
    fun StringToInteger_atoiTests(e: Int, x: String) {
        assertEquals(e, Solution.myAtoi(x))
    }
}