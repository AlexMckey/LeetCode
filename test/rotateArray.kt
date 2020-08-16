import org.junit.jupiter.api.Assertions.assertArrayEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import rotateArray.Solution

class RotateArrayTests {
    @ParameterizedTest
    @CsvSource("5,6,7,1,2,3,4;1,2,3,4,5,6,7;3","-1,-100,3,99;3,99,-1,-100;2", delimiter = ';')
    fun RotateArrayTests(e: String, a: String, k: Int) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.rotate(ia, k)
        assertArrayEquals(ex,ia)
    }

    @ParameterizedTest
    @CsvSource("5,6,7,1,2,3,4;1,2,3,4,5,6,7;3","-1,-100,3,99;3,99,-1,-100;2", delimiter = ';')
    fun RotateArraySliceTests(e: String, a: String, k: Int) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.rotateIndexSlice(ia, k)
        assertArrayEquals(ex,ia)
    }

    @ParameterizedTest
    @CsvSource("5,6,7,1,2,3,4;1,2,3,4,5,6,7;3","-1,-100,3,99;3,99,-1,-100;2", delimiter = ';')
    fun RotateArrayReverseTests(e: String, a: String, k: Int) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.rotateByReverse(ia, k)
        assertArrayEquals(ex,ia)
    }

    @ParameterizedTest
    @CsvSource("5,6,7,1,2,3,4;1,2,3,4,5,6,7;3","-1,-100,3,99;3,99,-1,-100;2", "17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16;1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27;38", delimiter = ';')
    fun RotateArrayCycleTests(e: String, a: String, k: Int) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.rotateCycle(ia, k)
        assertArrayEquals(ex,ia)
    }
}