package removeElement

//val nums = intArrayOf(3,2,2,3)
val nums = intArrayOf(0,1,2,2,3,0,4,2)
val v = 2
var cur = nums.size-1
while (cur > 0 && nums[cur] == v) {cur--}
cur
for (i in cur - 1 downTo 0) {
    if (nums[i] == v) {
        nums[i] = nums[cur--]
    }
}
nums.toList()
nums.size - cur + 1