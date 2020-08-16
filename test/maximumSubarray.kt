import maximumSubarray.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MaximumSubarrayTests {
    @ParameterizedTest
    @CsvSource("6;-2,1,-3,4,-1,2,1,-5,4", delimiter = ';')
    fun MaximumSubarrayTest(e: String, v: String) {
        assertEquals(e.toInt(), Solution.maxSubArray(v.split(",").map { it.toInt() }.toIntArray()))
    }
}