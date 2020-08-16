package threeSumClosest

import kotlin.math.absoluteValue

object Solution {
    // Accepted	240 ms	36 MB	kotlin
    //Runtime: 240 ms, faster than 57.35% of Kotlin online submissions for 3Sum Closest.
    //Memory Usage: 36 MB, less than 33.33% of Kotlin online submissions for 3Sum Closest.
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        val ia = nums.sorted()
        var res = 0
        var delta = Int.MAX_VALUE
        val len = ia.size
        for (i in 0 .. (len-2)) {
            var l = i + 1
            var r = len - 1
            while (l < r) {
                val sum = ia[i] + ia[l] + ia[r]
                when {
                    sum == target -> return target
                    sum < target -> ++l
                    else -> --r
                }
                if ((target - sum).absoluteValue < delta) {
                    delta = (target - sum).absoluteValue
                    res = sum
                }
            }
        }
        return res
    }
}