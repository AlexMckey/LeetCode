package longestSubstringWithoutRepeatingCharacters

import kotlin.math.max

object Solution {
    // very slow
    // Accepted	468 ms	41 MB	kotlin
    fun lengthOfLongestSubstring(s: String): Int {
        fun splt(s: String, ch: Char): List<String> {
            return when {
                s.isEmpty() -> emptyList()
                s.indexOf(ch) < 0 -> listOf(s)
                else -> /*listOf(ch.toString()) +*/ s.split(ch).zipWithNext { a, b -> "$a$ch$b" }
            }
        }
        return if (s.length == 1) 1
        else s.toSet().fold(listOf(s)){
                acc, c -> acc.flatMap { splt(it,c) }.distinct()}
            .map { it.length }.max()!!
    }

    // BruteForse O(n^3) - in function style
    fun lenLongSubsBrute(s: String): Int =
        (s.indices)
            .flatMap { f ->
                ((f + 1) until s.length)
                    .map { s -> (f..s) }
            }
            .map {
                val str = s.slice(it)
                (str.toSet().size == str.length) to str.length
            }
            .filter { it.first }
            .maxBy { it.second }
            ?.second ?: 1

    // BruteForse O(n^3) - with cycles and unique check with HashSet
    fun lenLongSubsBruteCycle(s: String): Int {
        fun allUnique(s: String, from: Int, to: Int): Boolean {
            val hs = HashSet<Char>()
            for (i in from until to)
                if (hs.contains(s[i])) return false
                else hs.add(s[i])
            return true
        }
        val l = s.length
        var res = 0
        for (i in 0 until l)
            for (j in (i+1) .. l)
                if (allUnique(s,i,j)) res = maxOf(res, j - i)
        return res
    }

    // SlidingWindow and HashSet O(n^2)
    // Accepted	220 ms	35 MB	kotlin
    //Runtime: 220 ms, faster than 74.31% of Kotlin online submissions for Longest Substring Without Repeating Characters.
    //Memory Usage: 35 MB, less than 64.85% of Kotlin online submissions for Longest Substring Without Repeating Characters.
    fun lenLongSubsSlideHS(s: String): Int {
        val l = s.length
        val hs = HashSet<Char>()
        var res = 0
        var i = 0
        var j = 0
        while (i < l && j < l)
            if (hs.contains(s[j]))
                hs.remove(s[i++])
            else {
                hs.add(s[j++])
                res = maxOf(res, j - i)
            }
        return res
    }

    // SlidingWindow and HashMap O(n^2) - optimize change i
    // Accepted	208 ms	36.1 MB	kotlin
    //Runtime: 208 ms, faster than 83.12% of Kotlin online submissions for Longest Substring Without Repeating Characters.
    //Memory Usage: 36.1 MB, less than 35.16% of Kotlin online submissions for Longest Substring Without Repeating Characters.
    fun lenLongSubsSlideHM(s: String): Int {
        val l = s.length
        val hm = HashMap<Char,Int>()
        var res = 0
        var i = 0
        s.indices.forEach{ j ->
            if (hm.containsKey(s[j]))
                i = maxOf(hm[s[j]]!!,i)
            res = maxOf(res, j - i + 1)
            hm[s[j]] = j + 1
        }
        return res
    }


}