package zigZagConversion

import kotlin.math.absoluteValue

object Solution {
    // Accepted	284 ms	36.2 MB	kotlin
    //Runtime: 284 ms, faster than 53.00% of Kotlin online submissions for ZigZag Conversion.
    //Memory Usage: 36.2 MB, less than 12.50% of Kotlin online submissions for ZigZag Conversion.
    fun convert(s: String, numRows: Int): String =
        if (s.isEmpty() || s.length < 2 || numRows == 1) s
        else s.mapIndexed { i, c ->
            (numRows - 1 - i % (numRows * 2 - 2)).absoluteValue to c
        }.groupBy({ it.first }, { it.second })
            .values
            .joinToString("") { it.joinToString("") }
}