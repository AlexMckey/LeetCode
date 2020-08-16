package climbingStairs

object Solution {
//    private fun fibonacci() = sequence {
//        var prevCur = 1L to 1L
//        while (true) {
//            yield (prevCur.first)
//            prevCur = prevCur.second to prevCur.first + prevCur.second
//        }
//    }
//    // Accepted	152 ms	33.9 MB	kotlin
//    fun climbStairs(n: Int): Int = fibonacci().drop(n).first().toInt()

    // faster
    // Accepted	136 ms	31.5 MB	kotlin
    //Runtime: 136 ms, faster than 49.67% of Kotlin online submissions for Climbing Stairs.
    //Memory Usage: 31.5 MB, less than 46.43% of Kotlin online submissions for Climbing Stairs.
    tailrec fun climbStairs(n: Int, first: Int = 0, second: Int = 1): Int =
        if (n == 0) second
        else climbStairs(n-1, second, first + second)
}