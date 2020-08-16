import majorityElement.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MajorityElementTests {
    @ParameterizedTest
    @CsvSource("3;3,2,3","2;2,2,1,1,1,2,2", delimiter = ';')
    fun MajorityElementTest(e: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.majorityElement(ia))
    }

    @ParameterizedTest
    @CsvSource("3;3,2,3","2;2,2,1,1,1,2,2", delimiter = ';')
    fun MajorityElementFoldTest(e: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.majorityElementFold(ia))
    }

    @ParameterizedTest
    @CsvSource("3;3,2,3","2;2,2,1,1,1,2,2", delimiter = ';')
    fun MajorityElementForTest(e: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.majorityElementFor(ia))
    }
}