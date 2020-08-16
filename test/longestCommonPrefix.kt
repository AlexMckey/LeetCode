import longestCommonPrefix.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LCPTests {
    @ParameterizedTest
    @CsvSource("fl;flower,flow,flight",";dog,racecar,car",";c,acc,ccc", delimiter = ';')
    fun LCPTests(e: String?, v: String) {
        assertEquals(e?:"", Solution.longestCommonPrefix(v.split(',').toTypedArray()))
    }

    @ParameterizedTest
    @CsvSource("fl;flower,flow,flight",";dog,racecar,car",";c,acc,ccc", delimiter = ';')
    fun LCPBuiltinTests(e: String?, v: String) {
        assertEquals(e?:"", Solution.builtinLongestCommonPrefix(v.split(',').toTypedArray()))
    }
}