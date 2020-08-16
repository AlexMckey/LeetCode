import climbingStairs.Solution
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ClimbingStairsTests {
    @ParameterizedTest
    @CsvSource("2;2","3;3", delimiter = ';')
    fun ClimbingStairsTests(e: Int, x: Int) {
        assertEquals(e, Solution.climbStairs(x))
    }
}