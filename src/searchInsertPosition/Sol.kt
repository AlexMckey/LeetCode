package searchInsertPosition

object Solution {
//    fun searchInsert(nums: IntArray, target: Int): Int {
//        return nums.takeWhile { it < target }.count()
//    }

    // binary search
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size
        while (start < end){
            val middle = (end - start) / 2 + start
            if (nums[middle] == target){
                return middle
            }
            if (nums[middle] > target){
                end = middle
            } else {
                start = middle + 1
            }
        }
        return start
    }
}