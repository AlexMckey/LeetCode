package stringToInteger_atoi

object Solution {
    // Accepted	180 ms	34.4 MB	kotlin
    //Runtime: 180 ms, faster than 87.77% of Kotlin online submissions for String to Integer (atoi).
    //Memory Usage: 34.4 MB, less than 75.00% of Kotlin online submissions for String to Integer (atoi).
    fun myAtoi(str: String): Int {
        val s = str.trim()
        if (s.isEmpty()) return 0
        var i = 0
        val k = when(s[i]) {
            '-' -> {
                i++
                -1
            }
            '+' -> {
                i++
                1
            }
            else -> 1
        }
        var res = 0L
        while (i < s.length && s[i].isDigit()) {
            res = s[i] - '0' + res * 10
            when {
                res > Int.MAX_VALUE && k == 1 -> return Int.MAX_VALUE
                res > Int.MAX_VALUE && k == -1 -> return Int.MIN_VALUE
                else -> i++
            }
        }
        return k*res.toInt()
    }
}