val s1 = "babad"
val s2 = "abbd"
val s3 = "fraceaecarsdvbgf"

fun naiveLongestPalindromes(s: String): List<Pair<Int,String>> {
    val seqLen = s.length
    val lLen = 2 * seqLen + 1
    val res = mutableListOf<Pair<Int,String>>()
    for (i in 0 until lLen) {
        var m = i / 2
        var e = m + i % 2

        while (m > 0 && e < seqLen && s[m - 1] == s[e]) {
            m -= 1
            e += 1
        }
        res.add(e - m to s.substring(m,e))
    }
    return res
}

val p1 = naiveLongestPalindromes(s1)
p1.maxBy { it.first }
val p2 = naiveLongestPalindromes(s2)
p2.maxBy { it.first }
val p3 = naiveLongestPalindromes(s3)
p3.maxBy { it.first }