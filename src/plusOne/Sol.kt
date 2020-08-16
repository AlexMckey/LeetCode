package plusOne

object Solution {
//    fun plusOne(digits: IntArray): IntArray {
//        var curry = 1
//        var res = IntArray(digits.size+1){ i -> if (i == 0) 0 else digits[i-1] }
//        for (i in res.indices.reversed()){
//            val c = curry + res[i]
//            res[i] = c % 10
//            curry = c / 10
//        }
//        return if (res[0] > 0) res else res.sliceArray(res.indices.drop(1))
//    }
    //mach faster
    // Accepted	168 ms	33.2 MB	kotlin
    //Runtime: 168 ms, faster than 92.26% of Kotlin online submissions for Plus One.
    //Memory Usage: 33.2 MB, less than 74.29% of Kotlin online submissions for Plus One.
    fun plusOne(digits: IntArray): IntArray {
        val n = digits.size
        for (i in digits.indices.reversed())
            if (digits[i] == 9) digits[i] = 0
            else {
                digits[i]++
                return digits }
        val res = IntArray(n+1) {0}
        res[0] = 1
        return res
    }
}