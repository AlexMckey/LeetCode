package twoSumII

val nums = intArrayOf(2, 7, 11, 15)
val target = 18

var idxs = nums.indices.toList()
idxs = idxs.reversed().dropWhile { nums[it] + nums[idxs.first()] >= target }
idxs
idxs = idxs.reversed().dropWhile { nums[it] + nums[idxs.first()] <= target }
idxs
idxs = idxs.reversed().dropWhile { nums[it] + nums[idxs.first()] >= target }
idxs

var r = nums.size-1
var l = 0
while (r>l && nums[l] + nums[r] != target){
    if (nums[l] + nums[r] > target)
        while (nums[l] + nums[r] > target) r--
    else while (nums[l] + nums[r] < target) l++
    println("l:$l r:$r")
}
"l:$l r:$r"