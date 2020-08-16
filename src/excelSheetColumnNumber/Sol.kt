package excelSheetColumnNumber

object Solution {
    // 	Accepted	160 ms	34 MB	kotlin
    //Runtime: 160 ms, faster than 81.82% of Kotlin online submissions for Excel Sheet Column Number.
    //Memory Usage: 34 MB, less than 50.00% of Kotlin online submissions for Excel Sheet Column Number.
    fun titleToNumber(s: String): Int =
        s.map { it - 'A' + 1 }.
            reduce { acc, i -> acc * 26 + i }
}