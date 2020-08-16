package longestCommonPrefix

object Solution {
//    fun longestCommonPrefix(strs: Array<String>): String {
//        if (strs.isNullOrEmpty()) return ""
//        for (i in strs[0].indices) {
//            val ch = strs[0][i]
//            for (s in strs.drop(1)) {
//                if (i == s.length || s[i] != ch) {
//                    return strs[0].substring(0, i)
//                }
//            }
//        }
//        return strs[0]
//    }

    //More simple
//    fun longestCommonPrefix(strs: Array<String>): String {
//        if (strs.isNullOrEmpty()) return ""
//        if (strs.size == 1) return strs[0]
//        strs.sort()
//        return strs.first().zip(strs.last())
//            .takeWhile { p -> p.first == p.second }
//            .map { it.first }.joinToString("")
//    }

    //builtin
    fun builtinLongestCommonPrefix(strs: Array<String>): String =
        when {
            strs.isNullOrEmpty() -> ""
            strs.size == 1 -> strs[0]
            //else -> strs.reduce(String::commonPrefixWith)
            else -> strs.reduce{acc, s ->  acc.commonPrefixWith(s)}
        }

    //fastest and elegant
    fun longestCommonPrefix(strs: Array<String>): String =
        when {
            strs.isNullOrEmpty() -> ""
            strs.size == 1 -> strs[0]
            else -> strs.reduce(::calcPrefix)
        }

    //private fun calcPrefix(s1: String, s2: String): String =
    //    s1.zip(s2)
    //        .takeWhile { it.first == it.second }
    //        .joinToString("") { it.first.toString() }
//    private fun calcPrefix(s1: String, s2: String): String =
//        helper(s1,s2)
//    private tailrec fun helper(s1: String, s2: String, idx: Int = 0): String =
//        if (idx < s1.length && idx < s2.length && s1[idx] == s2[idx])
//            helper(s1, s2, idx+1)
//        else s1.take(idx)
    private fun calcPrefix(s1: String, s2: String): String =
        s1.substring(0,s1.zip(s2).takeWhile { it.first == it.second }.count())
}