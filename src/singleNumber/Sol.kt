package singleNumber

object Solution {
    // 	Accepted	356 ms	48.2 MB	kotlin
    //Runtime: 356 ms, faster than 27.07% of Kotlin online submissions for Single Number.
    //Memory Usage: 48.2 MB, less than 6.12% of Kotlin online submissions for Single Number.
    fun mySingleNumber(nums: IntArray): Int =
        nums.groupBy { it }.minByOrNull { it.value.size }?.key ?: 0

    // more faster
    // Accepted	236 ms	36 MB	kotlin
    //Runtime: 236 ms, faster than 51.09% of Kotlin online submissions for Single Number.
    //Memory Usage: 36 MB, less than 73.47% of Kotlin online submissions for Single Number.
    fun singleNumber(nums: IntArray): Int =
        nums.fold(0,Int::xor)
}