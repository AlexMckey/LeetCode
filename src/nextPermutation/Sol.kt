package nextPermutation

object Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var cur = nums.lastIndex-1
        while (cur >= 0 && nums[cur+1] <= nums[cur]){
            cur--
        }
        if (cur < 0) nums.sort()
        else {
            var i = nums.lastIndex
            while (i > cur && nums[cur] > nums[i]){
                i--
            }
            println(i)
            val t = nums[i]
            nums[i] = nums[cur]
            nums[cur] = t
        }
    }
}