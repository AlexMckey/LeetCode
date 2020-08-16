import letterCombinationsOfAPhoneNumber.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LetterCombinationsOfAPhoneNumberTests {
    @ParameterizedTest
    @CsvSource("ad,ae,af,bd,be,bf,cd,ce,cf;23", ";", delimiter = ';')
    fun LetterCombinationsOfAPhoneNumberTest(e: String?, v: String?) {
        val ex = e?.split(",")?.toTypedArray()?: emptyArray()
        val vx = v ?: ""
        assertArrayEquals(ex, Solution.letterCombinations(vx).toTypedArray())
    }
}