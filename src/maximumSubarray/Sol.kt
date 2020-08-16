package maximumSubarray

import kotlin.math.max

object Solution {
//    @OptIn(ExperimentalStdlibApi::class)
//    fun maxSubArray(nums: IntArray): Int =
//        nums.scanReduce { a, b -> max(a+b,b) }.max()!!
    fun maxSubArray(nums: IntArray): Int =
        if (nums.size == 1) nums[0]
        else  nums.drop(1).fold(nums[0] to nums[0]){
                acc, i ->
            max(acc.first, max(acc.second + i, i)) to max(acc.second + i, i)
        }.first
}