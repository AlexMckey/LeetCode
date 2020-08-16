import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import singleNumber.Solution

class SingleNumberTests {
    @ParameterizedTest
    @CsvSource("1;2,2,1", "4;4,1,2,1,2", delimiter = ';')
    fun SingleNumberTests(e: Int, a: String?) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        assertEquals(e, Solution.singleNumber(ia))
    }

    @ParameterizedTest
    @CsvSource("1;2,2,1", "4;4,1,2,1,2", delimiter = ';')
    fun MySingleNumberTests(e: Int, a: String?) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        assertEquals(e, Solution.mySingleNumber(ia))
    }
}