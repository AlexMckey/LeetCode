package containerWithMostWater

object Solution {
    // bruteforce algorithm - slowly
    fun maxAreaBrute(height: IntArray): Int {
        val len = height.size
        return (0 until (len-1)).map { i -> (i+1 until len).map { j -> minOf(height[j],height[i]) * (j - i) }
                .maxOrNull()!!}.maxOrNull()!!
    }

    // smarter and faster
    // Accepted	208 ms	35.9 MB	kotlin
    //Runtime: 208 ms, faster than 93.12% of Kotlin online submissions for Container With Most Water.
    //Memory Usage: 35.9 MB, less than 84.62% of Kotlin online submissions for Container With Most Water.
    fun maxArea(height: IntArray): Int {
        var m = 0
        var l = 0
        var r = height.size-1
        while (l < r){
            m = maxOf(m, minOf(height[l],height[r])*(r-l))
            if (height[l] < height[r]) l++
            else r--
        }
        return m
    }
}