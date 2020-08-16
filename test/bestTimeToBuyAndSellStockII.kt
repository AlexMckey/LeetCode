import bestTimeToBuyAndSellStockII.Solution

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals

class BestTimeToBuyAndSellStockIITests {
    @ParameterizedTest
    @CsvSource("7;7,1,5,3,6,4", "4;1,2,3,4,5", "0;7,6,4,3,1", delimiter = ';')
    fun BestTimeToBuyAndSellStockIITests(e: Int, a: String?) {
        val ia = if (a.isNullOrEmpty()) intArrayOf() else a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.maxProfit(ia))
    }
    @ParameterizedTest
    @CsvSource("7;7,1,5,3,6,4", "4;1,2,3,4,5", "0;7,6,4,3,1", delimiter = ';')
    fun BestTimeToBuyAndSellStockIIClearlyTests(e: Int, a: String?) {
        val ia = if (a.isNullOrEmpty()) intArrayOf() else a.split(",").map { it.toInt() }.toIntArray()
        assertEquals(e, Solution.maxProfitClearly(ia))
    }
}