import countAndSay.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CountAndSayTests {
    @ParameterizedTest
    @CsvSource("1;1","11;2","21;3","1211;4","13211311123113112211;10", delimiter = ';')
    fun CountAndSayTest(e: String, x: Int) {
        assertEquals(e, Solution.countAndSay(x))
    }
}