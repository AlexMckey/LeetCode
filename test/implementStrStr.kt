import implementStrStr.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ImplementStrStrTests {
    @ParameterizedTest
    @CsvSource("2;Hello;ll","-1;aaaaa;bba","0;sdfs;", delimiter = ';')
    fun ImplementStrStrTest(e: Int, str: String, st: String?) {
        assertEquals(e, Solution.strStr(str, st ?: ""))
    }
}