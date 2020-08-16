fun isPalindrome(s: String, start: Int, end: Int): Boolean {
    var l = start
    var r = end
    while (l < r)
        if (s[l++] != s[--r]) return false
    return true
}

isPalindrome("babad",0,4)
isPalindrome("babad",0,3)
isPalindrome("babad",0,2)
isPalindrome("bdda",1,2)
isPalindrome("a",0,1)

val s = "babad"
var res = 0
var j = s.length
j > res
var i = s.indexOf(s[j-1])
j-i > res
var ss = s.substring(i,j)
var p = isPalindrome(s,i,j)
res = maxOf(res, j - i)
"i:$i, j:$j, s:$ss, p:$p, l:$res"
j--
j > res
i = s.indexOf(s[j-1])
j-i > res
ss = s.substring(i,j)
p = isPalindrome(s,i,j)
res = maxOf(res, j - i)
"i:$i, j:$j, s:$ss, p:$p, l:$res"
j--
j > res
i = s.indexOf(s[j-1])
j-i > res
ss = s.substring(i,j)
p = isPalindrome(s,i,j)
res = maxOf(res, j - i)
"i:$i, j:$j, s:$ss, p:$p, l:$res"
j--
j > res

fun longPalindrome(s: String): String {
    if (s.isEmpty() || s.length == 1) return s
    else {
        var res = 0
        var j = s.length
        var i = -1
        var resp = i to j
        while (i < j && j > res) {
            i = s.indexOf(s[j - 1], i + 1)
            if (i < 0) {
                i = -1
                j--
                continue
            } else if (j - i < res)
                continue
            //var ss = s.substring(i, j)
            if (isPalindrome(s, i, j) && j - i > res) {
                res = j - i
                resp = i to j
                j--
            }
        }
        return s.substring(resp.first, resp.second)
    }
}

longPalindrome("abbd")