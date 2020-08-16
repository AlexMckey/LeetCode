package addBinary

object Solution {
    // Accepted	200 ms	34.7 MB	kotlin
    //Runtime: 200 ms, faster than 55.64% of Kotlin online submissions for Add Binary.
    //Memory Usage: 34.7 MB, less than 27.27% of Kotlin online submissions for Add Binary.
    fun addBinary(a: String, b: String): String =
        b.padStart(a.length, '0')
            .map { it-'0' }
            .zip(a.padStart(b.length, '0')
                .map { it-'0' },Int::plus)
            .asReversed()
            .fold(StringBuilder() to 0) { acc, i ->
//                when (val n = acc.second + i) {
//                    2 -> acc.first.append(0) to 1
//                    3 -> acc.first.append(1) to 1
//                    else -> acc.first.append(n) to 0
//                }
                acc.first.append((acc.second+i)%2) to (acc.second+i)/2 }
            .let { (if (it.second == 1) it.first.append(1)
                    else it.first)}
            .reverse()
            .toString()
}