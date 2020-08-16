package sqrtInInt

object Solution {
    //Accepted	588 ms	237.7 MB	kotlin
//    fun mySqrt(x: Int): Int =
//        if (x < 2) x
//        else (generateSequence(2L){it + 1}
//            .dropWhile { it * it <= x }
//            .first()-1).toInt()

    // mach faster
    // Accepted	156 ms	32.4 MB	kotlin
    //Runtime: 156 ms, faster than 54.67% of Kotlin online submissions for Sqrt(x).
    //Memory Usage: 32.4 MB, less than 29.17% of Kotlin online submissions for Sqrt(x).
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        var l = 2
        var r = x / 2
        val t = x.toLong()
        while (l <= r) {
            val m = l + (r - l) / 2
            val n = m.toLong() * m
            when {
                n == t -> return m
                n < t -> l = m + 1
                else -> r = m - 1
            }
        }
        return r
    }
}