import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.function.Executable

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import nextPermutation.Solution

class NextPermutationTests {
    @ParameterizedTest
    @CsvSource("1,3,2;1,2,3", "1,2,3;3,2,1", "1,5,1;1,1,5", "2,1,3;1,3,2", delimiter = ';')
    fun NextPermutationTests(e: String, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.nextPermutation(ia)
        assertArrayEquals(ex,ia)
    }
}