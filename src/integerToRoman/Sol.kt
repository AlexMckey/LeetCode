package integerToRoman

import java.lang.StringBuilder

object Solution {
    // 	Accepted	232 ms	34.4 MB	kotlin
    //Runtime: 232 ms, faster than 50.00% of Kotlin online submissions for Integer to Roman.
    //Memory Usage: 34.4 MB, less than 100.00% of Kotlin online submissions for Integer to Roman.
    fun intToRoman(num: Int): String {
        val romans = arrayOf("I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M")
        val nums = intArrayOf(1,4,5,9,10,40,50,90,100,400,500,900,1000)
        val res = StringBuilder()
        var n = num
        var i = nums.size-1
        while (n > 0){
            while (nums[i] > n) i--
            n -= nums[i]
            res.append(romans[i])
        }
        return res.toString()
    }
}