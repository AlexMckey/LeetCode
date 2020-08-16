fun fastLongestPalindromes(seq: String): String {
    val seqLen = seq.length
    val l = mutableListOf<Triple<Int,Int,Int>>()
    var i = 0
    var palLen = 0
    while (i < seqLen) {
        if (i > palLen && seq[i - palLen - 1] == seq[i]) {
            palLen += 2
            i += 1
            continue
        }

        l.add(Triple(palLen, i, palLen))
        println(l)

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
            val x = minOf(d, l[j].first)
            l.add(Triple(x, i, d))
            println(l)
        }
        if (!found) {
            palLen = 1
            i += 1
        }
    }
    l.add(Triple(palLen,i, palLen))
    println(l)

    val lLen = l.size
    val s = lLen - 2
    val e = s - (2 * seqLen + 1 - lLen) + 1
    for (i in s downTo e) {
        val d = i - e
        val x = minOf(d, l[i].first)
        l.add(Triple(x,e-1,d))
        println(l)
    }
    val res = l.maxBy { it.first }!!
    println(res)
    return seq.substring(res.second - res.second, res.second)
}

var s = "babad"
fastLongestPalindromes(s)
fastLongestPalindromes("abbd")
fastLongestPalindromes("abdd")
fastLongestPalindromes("abadd")
fastLongestPalindromes("ac")