import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import validPalindrome.Solution

class ValidPalindromeTests {
    @ParameterizedTest
    @CsvSource("true;A man, a plan, a canal: Panama", "false;race a car", "true;", "true; ", "true;aa", delimiter = ';')
    fun ValidPalindromeTests(e: Boolean, a: String?) {
        assertEquals(e, Solution.isPalindrome(a ?: ""))
    }
}