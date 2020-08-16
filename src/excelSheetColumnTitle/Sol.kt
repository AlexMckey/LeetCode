package excelSheetColumnTitle

object Solution {
    // recursive
    // Accepted	208 ms	32.9 MB	kotlin
    //Runtime: 208 ms, faster than 16.00% of Kotlin online submissions for Excel Sheet Column Title.
    //Memory Usage: 32.9 MB, less than 28.57% of Kotlin online submissions for Excel Sheet Column Title.
    fun convertToTitle(n: Int): String {
        tailrec fun toLetter(n: Int, acc: String = ""): String =
            if (n == 0) acc
            else toLetter((n - 1) / 26, 'A' + (n - 1) % 26 + acc)
        return toLetter(n)
    }
}