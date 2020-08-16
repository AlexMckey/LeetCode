import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import validParentheses.Solution

class ValidParenthesesTests {
    @ParameterizedTest
    @CsvSource("true;()","true;()[]{}","false;(]","false;([)]","true;{[]}", delimiter = ';')
    fun ValidParenthesesTests(e: String?, v: String) {
        assertEquals(e?.toBoolean(), Solution.isValid(v))
    }
}