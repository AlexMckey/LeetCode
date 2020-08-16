package removeDuplicatesFromSortedArray

object Solution {
//    fun removeDuplicates(nums: IntArray): Int {
//        var idx = 0
//        var cur = idx+1
//        while (cur < nums.size) {
//            while (cur < nums.size && nums[idx] == nums[cur]) {cur++}
//            if (cur >= nums.size) nums[idx+1] = nums[cur-1]
//            else nums[idx++ +1] = nums[cur++]
//        }
//        return idx+1
//    }

    //Mach faster
    fun removeDuplicates(nums: IntArray): Int {
        //if (nums.size < 1) return 0
        var cur = 0
        for (i in nums.indices) {
            if (nums[i] != nums[cur]) {
                nums[++cur] = nums[i]
            }
        }
        return cur + 1
    }
}