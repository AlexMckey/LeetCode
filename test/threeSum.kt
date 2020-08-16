import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import threeSum.Solution
import org.junit.jupiter.api.Assertions.assertTrue

class ThreeSumTests {
    @ParameterizedTest
    @CsvSource("2;-1,0,1,2,-1,-4", "1;0,0,0", "0;1,2,-2,-1", "0;3,-2,1,0", "6;-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6", delimiter = ';')
    fun ThreeSumTests(e: Int, a: String?) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        val res = Solution.threeSum(ia)
        assertEquals(e, res.size)
        assertTrue { res.all { it.sum() == 0 } }
    }

    @ParameterizedTest
    @CsvSource("2;-1,0,1,2,-1,-4", "1;0,0,0", "0;1,2,-2,-1", "0;3,-2,1,0", "6;-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6", delimiter = ';')
    fun ThreeSumOptimazedTests(e: Int, a: String?) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        val res = Solution.threeSumOptimized(ia)
        assertEquals(e, res.size)
        assertTrue { res.all { it.sum() == 0 } }
    }
}