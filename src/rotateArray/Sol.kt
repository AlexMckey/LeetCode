package rotateArray

object Solution {
    // Accepted	224 ms	38 MB	kotlin
    //Runtime: 224 ms, faster than 61.44% of Kotlin online submissions for Rotate Array.
    //Memory Usage: 38 MB, less than 6.45% of Kotlin online submissions for Rotate Array.
    fun rotate(nums: IntArray, k: Int): Unit {
        val res = nums.takeLast(k%nums.size) + nums.dropLast(k%nums.size)
        res.toIntArray().copyInto(nums)
    }
    // slice with new indexes
    // Accepted	236 ms	37.9 MB	kotlin
    fun rotateIndexSlice(nums: IntArray, k: Int): Unit {
        nums.sliceArray(nums.indices.map { (it + nums.size - k)%nums.size }).copyInto(nums)
    }
    // as 3 times reverse
    // Accepted	204 ms	34.6 MB	kotlin
    fun rotateByReverse(nums: IntArray, k: Int): Unit {
        fun reverse(a: IntArray, from: Int = 0, to: Int? = null): Unit {
            var i = from
            var j = to ?: a.size-1
            while(i < j)
            {
                val t = a[i]
                a[i++] = a[j]
                a[j--] = t
            }
        }
        reverse(nums)
        reverse(nums,0,k % nums.size - 1)
        reverse(nums,k % nums.size)
    }
    // rotate by smart cycle
    fun rotateCycle(nums: IntArray, k: Int): Unit {
        if (nums.size < 2 || k == 0 || nums.size == k) return
        var cnt = 0
        var i = 0
        var s = k % nums.size
        while(cnt < nums.size) {
            var j = i
            var num = nums[j]
            do {
                j = (j + s) % nums.size
                var temp = nums[j]
                nums[j] = num
                num = temp
                cnt++
            } while(j != i);
            i++
        }
    }
}