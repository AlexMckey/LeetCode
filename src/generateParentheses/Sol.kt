package generateParentheses

import java.lang.StringBuilder

object Solution {
    fun generateParenthesis(n: Int): List<String> {
        tailrec fun genBracket(n: Int, acc: List<String>): List<String> =
            if (n == 1) acc
            else genBracket(n-1, acc.flatMap { st -> (st.withIndex()
                .filter { ic -> ic.value == '(' }
                .map { it.index+1 } + 0)
                .map { StringBuilder(st).insert(it,"()") }
                .map { it.toString()} }
                .toSet().toList())
        return genBracket(n, listOf("()"))
    }
}