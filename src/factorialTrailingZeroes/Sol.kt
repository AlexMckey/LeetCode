package factorialTrailingZeroes

object Solution {
    // Accepted	144 ms	31.7 MB	kotlin
    //Runtime: 144 ms, faster than 52.00% of Kotlin online submissions for Factorial Trailing Zeroes.
    //Memory Usage: 31.7 MB, less than 100.00% of Kotlin online submissions for Factorial Trailing Zeroes.
    fun trailingZeroes(n: Int): Int {
        tailrec fun divs(num: Int, cur: Int = 0, acc: Int = 0): Int =
            if (num == 0) acc
            else divs(num / 5, cur * 5 + 1, acc + num % 5 * cur)
        return divs(n)
    }

    // more simple and clearly
    fun trailingZerosSimple(n: Int): Int {
        var i = n
        var res = 0
        while (i != 0) {
            res += i / 5
            i /= 5
        }
        return res
    }
}