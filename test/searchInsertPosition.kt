import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import searchInsertPosition.Solution

class SearchInsertPositionTests {
    @ParameterizedTest
    @CsvSource("2;1,3,5,6;5","1;1,3,5,6;2","4;1,3,5,6;7","0;1,3,5,6;0", delimiter = ';')
    fun SearchInsertPositionTest(e: Int, arr: String, num: Int) {
        assertEquals(e, Solution.searchInsert(arr.split(",").map { it.toInt() }.toIntArray(), num))
    }
}