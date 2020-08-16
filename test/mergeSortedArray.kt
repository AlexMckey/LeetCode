import mergeSortedArray.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MergeSortedArrayTests {
    @ParameterizedTest
    @CsvSource("1,2,2,3,5,6;1,2,3;2,5,6", "1;;1", delimiter = ';')
    fun MergeSortedArrayTests(e: String, a: String?, b: String?) {
        val ib = if (b.isNullOrEmpty()) intArrayOf() else b.split(",").map { it.toInt() }.toIntArray()
        val ta = if (a.isNullOrEmpty()) intArrayOf() else a.split(",").map { it.toInt() }.toIntArray()
        val ia = IntArray(ib.size+ta.size){ i -> if (i >= ta.size) 0 else ta[i] }
        val ex = e.split(",").map { it.toInt() }.toIntArray()
        Solution.merge(ia, ta.size, ib, ib.size)
        assertArrayEquals(ex,ia)
    }
}