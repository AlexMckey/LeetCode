package mergeSortedArray

object Solution {
    //builtin
//    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//        val cnt = m - n
//        nums2.forEachIndexed { i, v -> nums1[cnt+i] = v }
//        nums1.sort()
//    }

    // Accepted	188 ms	34.1 MB	kotlin
    //Runtime: 188 ms, faster than 47.24% of Kotlin online submissions for Merge Sorted Array.
    //Memory Usage: 34.1 MB, less than 71.15% of Kotlin online submissions for Merge Sorted Array.
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var ri = m+n-1
        var ai = m-1
        var bi = n-1
        while (ri >= 0) {
            if (bi < 0) return
            if (ai < 0) {
                while (bi >= 0)
                    nums1[ri--] = nums2[bi--]
                return }
            if (nums1[ai] > nums2[bi])
                nums1[ri--] = nums1[ai--]
            else
                nums1[ri--] = nums2[bi--]
        }
    }
}