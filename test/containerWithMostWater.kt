import containerWithMostWater.Solution
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ContainerWithMostWaterTests {
    @ParameterizedTest
    @CsvSource("49;1,8,6,2,5,4,8,3,7", "1;2,1", "1;1,2", "2;1,2,1", delimiter = ';')
    fun ContainerWithMostWaterTests(e: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.maxArea(ia))
    }

    @ParameterizedTest
    @CsvSource("49;1,8,6,2,5,4,8,3,7", "1;2,1", "1;1,2", "2;1,2,1", delimiter = ';')
    fun ContainerWithMostWaterBruteTests(e: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.maxAreaBrute(ia))
    }
}