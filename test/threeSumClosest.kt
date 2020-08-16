import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import threeSumClosest.Solution
import org.junit.jupiter.api.Assertions.assertTrue

class ThreeSumClosestTests {
    @ParameterizedTest
    @CsvSource("0;-1,0,1,2,-1,-4;0", "2;-1,2,1,-4;1", delimiter = ';')
    fun ThreeSumClosestTests(e: Int, a: String, num: Int) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.threeSumClosest(ia,num))
    }
}