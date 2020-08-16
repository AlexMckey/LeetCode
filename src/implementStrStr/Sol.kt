package implementStrStr

object Solution {
    //builtin
//    fun strStr(haystack: String, needle: String): Int {
//        return haystack.indexOf(needle)
//    }

    fun strStr(haystack: String, needle: String): Int {
        if(needle == "") return 0
        val len = needle.length
        for(i in 0..haystack.length-len)
            if(haystack[i] == needle[0])
                if (haystack.substring(i, i + len) == needle) return i
        return -1
    }
}