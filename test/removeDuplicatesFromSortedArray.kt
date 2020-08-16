import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.function.Executable

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import removeDuplicatesFromSortedArray.Solution
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTests {
    @ParameterizedTest
    @CsvSource("1,2;2;1,2,2","0,1,2,3,4;5;0,0,1,1,1,2,2,3,3,4","1,2,3;3;1,2,3", delimiter = ';')
    fun RemoveDuplicatesFromSortedArrayTests(e: String, v: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        val res = Solution.removeDuplicates(ia)
        assertAll(
            Executable { assertEquals(v, res) },
            Executable { assertArrayEquals(ex,ia.take(res).toIntArray())})
    }
}