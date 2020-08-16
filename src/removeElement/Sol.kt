package removeElement

object Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var cnt = 0
        var cur = nums.size-1
        while (cur > 0 && nums[cur] == `val`) {cnt++;cur--}
        for (i in cur downTo 0) {
            if (nums[i] == `val`) {
                nums[i] = nums[cur--]
                cnt++
            }
        }
        return nums.size-cnt
    }
}