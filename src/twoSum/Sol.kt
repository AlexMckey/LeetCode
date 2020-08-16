package twoSum

object Solution {
    //Memory Limit Exceeded
//    fun twoSum(nums: IntArray, target: Int): IntArray =
//        nums.mapIndexed{i,x -> x to i}
//            .flatMap { f -> nums.mapIndexed{i,x -> (x + f.first) to (f.second to i)}
//                .filterNot { tp -> tp.second.first == tp.second.second }}
//            .first { tp -> tp.first == target }
//            .let { tp -> intArrayOf(tp.second.first, tp.second.second) }

    //Accepted	196 ms	35.2 MB	kotlin
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val diffs = mutableMapOf<Int,Int>()
//        nums.mapIndexed{i,a  ->
//            val diff = target - a
//            if (diffs.containsKey(diff)) return intArrayOf(diffs[diff]!!,i)
//            else diffs[a] = i
//        }
//        return intArrayOf(0,0)
//    }

    //mach faster
    //Accepted	176 ms	34.9 MB	kotlin
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffs = HashMap<Int,Int>()
        for (idx in nums.indices) {
            val diff = target - nums[idx]
            if (diffs.containsKey(diff)) return intArrayOf(diffs[diff]!!,idx)
            diffs[nums[idx]] = idx
        }
        throw IllegalArgumentException("No solution")
    }
}