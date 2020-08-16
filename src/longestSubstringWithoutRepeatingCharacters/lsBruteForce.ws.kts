val s = "abcabcbb"
val len = s.length
s.indices
    .flatMap { f -> ((f+1) until len)
        .map { s -> (f..s) } }
    .map {
        val str = s.slice(it)
        (str.toSet().size == str.length) to str.length }
    .filter { it.first }
    .maxBy { it.second }
    ?.second ?: 0

fun allUnique(s: String, from: Int, to: Int): Boolean {
    val hs = HashSet<Char>()
    for (i in from until to)
        if (hs.contains(s[i])) return false
        else hs.add(s[i])
    return true
}
fun lenLongSubsBruteCycle(s: String): Int {
    val l = s.length
    var res = 0
    for (i in 0 until l)
        for (j in (i+1) .. l)
            if (allUnique(s,i,j)) res = maxOf(res, j - i)
    return res
}

lenLongSubsBruteCycle("abcabcbb")
lenLongSubsBruteCycle("pwwkew")
lenLongSubsBruteCycle("bbbbbb")