package generateParentheses

import java.lang.StringBuilder

val s1 = "()"
s1
val n = 2
val str = s1.repeat(n)
str
var i2 = s1.withIndex().filter { ic -> ic.value == '(' }.map { it.index+1 } + 0
i2
val s2 = i2.map { StringBuilder(s1).insert(it,"()") }.map { it.toString() }
s2
var s3 = s2.flatMap { st -> (st.withIndex()
    .filter { ic -> ic.value == '(' }
    .map { it.index+1 } + 0)
    .map { StringBuilder(st).insert(it,"()") }
    .map { it.toString()} }
    .toSet().toList()
s3
var s4 = s3.flatMap { st -> (st.withIndex()
    .filter { ic -> ic.value == '(' }
    .map { it.index+1 } + 0)
    .map { StringBuilder(st).insert(it,"()") }
    .map { it.toString()} }
    .toSet().toList()
s4
tailrec fun genBracket(n: Int, acc: List<String>): List<String> =
    if (n == 1) acc
    else genBracket(n-1, acc.flatMap { st -> (st.withIndex()
        .filter { ic -> ic.value == '(' }
        .map { it.index+1 } + 0)
        .map { StringBuilder(st).insert(it,"()") }
        .map { it.toString()} }
        .toSet().toList())
genBracket(1, listOf("()"))
genBracket(2, listOf("()"))
genBracket(3, listOf("()"))
genBracket(5, listOf("()"))