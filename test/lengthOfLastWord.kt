import lengthOfLastWord.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LengthOfLastWordTests {
    @ParameterizedTest
    @CsvSource("5;Hello World", delimiter = ';')
    fun LengthOfLastWordTest(e: String, v: String) {
        assertEquals(e.toInt(), Solution.lengthOfLastWord(v))
    }
}