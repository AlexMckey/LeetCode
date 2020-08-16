import longestPalindromicSubstring.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LongestPalindromicSubstringTests {
    @ParameterizedTest
    @CsvSource("bab;babad", "bb;cbbd", "c;ac", "aba;abadd", delimiter = ';')
    fun LongestPalindromicSubstringTest(e: String?, a: String) {
        assertEquals(e?.length ?: 0, Solution.longestPalindrome(a).length)
    }

    @ParameterizedTest
    @CsvSource("bab;babad", "bb;cbbd", "a;ac", "aba;abadd", delimiter = ';')
    fun FastLongestPalindromicSubstringTest(e: String, a: String) {
        assertEquals(e, Solution.fastLongestPalindromes(a))
    }
}