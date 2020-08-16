import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import fourSum.Solution
import org.junit.jupiter.api.Assertions.assertTrue

class FourSumTests {
    @ParameterizedTest
    @CsvSource("3;1,0,-1,0,-2,2;0", "1;2,1,0,-1;2", "8;-3,-2,-1,0,0,1,2,3;0",
        "29;-5,-4,-3,-2,-1,0,0,1,2,3,4,5;0", "1;5,5,3,5,1,-5,1,-2;4", delimiter = ';')
    fun FourSumTests(e: Int, a: String?, t: Int) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        val res = Solution.fourSum(ia,t)
        assertEquals(e, res.size)
        assertTrue { res.all { it.sum() == t } }
    }

    @ParameterizedTest
    @CsvSource("3;1,0,-1,0,-2,2;0", "1;2,1,0,-1;2", "8;-3,-2,-1,0,0,1,2,3;0",
        "29;-5,-4,-3,-2,-1,0,0,1,2,3,4,5;0", "1;5,5,3,5,1,-5,1,-2;4", delimiter = ';')
    fun FourSumFasterTests(e: Int, a: String?, t: Int) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        val res = Solution.fourSumFaster(ia,t)
        assertEquals(e, res.size)
        assertTrue { res.all { it.sum() == t } }
    }

    @ParameterizedTest
    @CsvSource("3;1,0,-1,0,-2,2;0", "1;2,1,0,-1;2", "8;-3,-2,-1,0,0,1,2,3;0",
        "29;-5,-4,-3,-2,-1,0,0,1,2,3,4,5;0", "1;5,5,3,5,1,-5,1,-2;4", delimiter = ';')
    fun FourSumBinarySearchTests(e: Int, a: String?, t: Int) {
        val ia = a?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
        val res = Solution.fourSumBS(ia,t)
        assertEquals(e, res.size)
        assertTrue { res.all { it.sum() == t } }
    }
}