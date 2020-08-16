import longestSubstringWithoutRepeatingCharacters.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LongestSubstringWithoutRepeatingCharactersTests {
    @ParameterizedTest
    @CsvSource("3;abcabcbb", "1;bbbbb", "3;pwwkew", delimiter = ';')
    fun LongestSubstringWithoutRepeatingCharactersTest(e: Int, a: String) {
        assertEquals(e, Solution.lengthOfLongestSubstring(a))
    }

    @ParameterizedTest
    @CsvSource("3;abcabcbb", "1;bbbbb", "3;pwwkew", delimiter = ';')
    fun LongestSubstringBruteTest(e: Int, a: String) {
        assertEquals(e, Solution.lenLongSubsBrute(a))
    }

    @ParameterizedTest
    @CsvSource("3;abcabcbb", "1;bbbbb", "3;pwwkew", delimiter = ';')
    fun LongestSubstringBruteCycleTest(e: Int, a: String) {
        assertEquals(e, Solution.lenLongSubsBruteCycle(a))
    }

    @ParameterizedTest
    @CsvSource("3;abcabcbb", "1;bbbbb", "3;pwwkew", delimiter = ';')
    fun LongestSubstringSlidingHSTest(e: Int, a: String) {
        assertEquals(e, Solution.lenLongSubsSlideHS(a))
    }

    @ParameterizedTest
    @CsvSource("3;abcabcbb", "1;bbbbb", "3;pwwkew", delimiter = ';')
    fun LongestSubstringSlidingHMTest(e: Int, a: String) {
        assertEquals(e, Solution.lenLongSubsSlideHM(a))
    }
}