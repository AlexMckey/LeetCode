package longestPalindromicSubstring

object Solution {
    private fun isPalindrome(s: String, start: Int, end: Int): Boolean {
        var l = start
        var r = end
        while (l <= r)
            if (s[l++] != s[--r]) return false
        return true
    }

    // Accepted	328 ms	34.5 MB	kotlin
    //Runtime: 328 ms, faster than 49.00% of Kotlin online submissions for Longest Palindromic Substring.
    //Memory Usage: 34.5 MB, less than 81.18% of Kotlin online submissions for Longest Palindromic Substring.
    fun longestPalindrome(s: String): String {
        if (s.isEmpty() || s.length == 1) return s
        else {
            var res = 0
            var j = s.length
            var i = -1
            var resp = i to j
            while (i < j && j > res) {
                i = s.indexOf(s[j - 1], i + 1)
                if (i < 0 || j - i < res) {
                    i = -1
                    j--
                    continue
                }
                //var ss = s.substring(i, j)
                if (isPalindrome(s, i, j) && j - i > res) {
                    res = j - i
                    resp = i to j
                    j--
                    i = -1
                }
            }
            return s.substring(resp.first, resp.second)
        }
    }

    // faster O(n) - https://www.akalin.com/longest-palindrome-linear-time
    // Accepted	188 ms	36 MB	kotlin
    //Runtime: 188 ms, faster than 87.46% of Kotlin online submissions for Longest Palindromic Substring.
    //Memory Usage: 36 MB, less than 34.72% of Kotlin online submissions for Longest Palindromic Substring.
    fun fastLongestPalindromes(seq: String): String {
        val seqLen = seq.length
        val l = mutableListOf<Pair<Int,Int>>()
        var i = 0
        var palLen = 0
        while (i < seqLen) {
            if (i > palLen && seq[i - palLen - 1] == seq[i]) {
                palLen += 2
                i += 1
                continue
            }

            l.add(palLen to i)

            val s = l.size - 2
            val e = s - palLen + 1
            var found = false
            for (j in s downTo e) {
                val d = j - e
                if (l[j].first == d) {
                    palLen = d
                    found = true
                    break
                }
                l.add(minOf(d, l[j].first) to i)
            }
            if (!found) {
                palLen = 1
                i += 1
            }
        }
        l.add(palLen to i)

        val lLen = l.size
        val s = lLen - 2
        val e = s - (2 * seqLen + 1 - lLen) + 1
        for (i in s downTo e) {
            val d = i - e
            l.add(minOf(d, l[i].first) to e-1)
        }
        val res = l.maxBy { it.first }!!
        return seq.substring(res.second - res.first, res.second)
    }
}