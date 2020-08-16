package twoSumII

object Solution {
    //Accepted	176 ms	35 MB	kotlin
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var r = nums.size-1
        var l = 0
        while (r>l && nums[l] + nums[r] != target){
            if (nums[l] + nums[r] > target)
                while (nums[l] + nums[r] > target) r--
            else while (nums[l] + nums[r] < target) l++
            //println("l:$l r:$r")
        }
        return intArrayOf(l+1,r+1)
    }
}