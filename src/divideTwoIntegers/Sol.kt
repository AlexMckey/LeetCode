package divideTwoIntegers

import kotlin.math.absoluteValue
import kotlin.math.sign

object Solution {
    // Accepted	1420 ms	32.4 MB	kotlin
    //Runtime: 1420 ms, faster than 31.67% of Kotlin online submissions for Divide Two Integers.
    //Memory Usage: 32.4 MB, less than 100.00% of Kotlin online submissions for Divide Two Integers.
    fun divide(dividend: Int, divisor: Int): Int {
        val sign = dividend.sign * divisor.sign
        if (dividend == Int.MIN_VALUE && divisor == 1) return Int.MIN_VALUE
        else if (dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE
        else if (dividend == Int.MAX_VALUE && divisor == 1) return Int.MAX_VALUE
        else if (dividend == Int.MAX_VALUE && divisor == -1) return -Int.MAX_VALUE
        val d = divisor.absoluteValue
        var cnt = 0
        var diff = dividend.absoluteValue - d
        while (diff >= 0){
            cnt++
            diff -= d
        }
        return cnt * sign
    }

    // faster - bit shifting operation
    // Accepted	144 ms	32.4 MB	kotlin
    //Runtime: 144 ms, faster than 96.67% of Kotlin online submissions for Divide Two Integers.
    //Memory Usage: 32.4 MB, less than 100.00% of Kotlin online submissions for Divide Two Integers.
    fun divideFaster(dividend: Int, divisor: Int): Int {
        if (divisor == 1) return dividend
        else if (dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE
        else if (divisor == -1) return -dividend
        else if (dividend == 0) return 0

        var a = dividend.absoluteValue
        val b = divisor.absoluteValue
        var res = 0
        var x = 0

        while (a - b >= 0) {
            x = 0
            while (a - (b shl x + 1) >= 0) {
                x++
            }
            res += 1 shl x
            a -= b shl x
        }

        return res * dividend.sign * divisor.sign
    }
}