import org.junit.jupiter.api.Assertions.assertArrayEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import plusOne.Solution

class PlusOneTests {
    @ParameterizedTest
    @CsvSource("1,2,4;1,2,3","4,3,2,2;4,3,2,1","1,0;9","1,5,0;1,4,9", delimiter = ';')
    fun PlusOneTests(e: String, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        assertArrayEquals(ex, Solution.plusOne(ia))
    }
}