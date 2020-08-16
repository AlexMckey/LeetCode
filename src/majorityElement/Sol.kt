package majorityElement

object Solution {
    // use builtin function
    // Accepted	280 ms	40.5 MB	kotlin
    fun majorityElement(nums: IntArray): Int =
        nums.groupBy { it }.maxBy { it.value.size }?.key ?: 0

    // Boyer-Moore Voting Algorithm
    // by using fold function
    fun majorityElementFold(nums: IntArray): Int =
        nums.fold(nums[0] to 0){ acc, i ->
            when {
                acc.first == i -> i to acc.second + 1
                acc.second != 0 -> acc.first to acc.second-1
                else -> i to 1
            }
        }.first

    // Boyer-Moore Voting Algorithm
    // with for cycle
    fun majorityElementFor(nums: IntArray): Int {
        var res = 0
        var cnt = 0
        for (i in nums){
            if (cnt == 0) res = i
            cnt += if (i == res) 1 else -1
        }
        return res
    }
}