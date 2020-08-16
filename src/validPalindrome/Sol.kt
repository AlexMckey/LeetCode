package validPalindrome

object Solution {
    // Accepted	228 ms	34.4 MB	kotlin
    //Runtime: 228 ms, faster than 50.70% of Kotlin online submissions for Valid Palindrome.
    //Memory Usage: 34.4 MB, less than 80.00% of Kotlin online submissions for Valid Palindrome.
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l <= r) {
            while (l <= r && !s[l].isLetterOrDigit()) { l++ }
            while (r >= l && !s[r].isLetterOrDigit()) { r-- }
            if (l < r &&
                s[l].toUpperCase() != s[r].toUpperCase()) {
                return false
            }
            l++
            r--
        }
        return true
    }
}