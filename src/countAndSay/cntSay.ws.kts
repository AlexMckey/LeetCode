package countAndSay

tailrec fun rle(text: String, prev: String = ""): String {
    if (text.isEmpty()) return prev
    val cur = text[0]
    val cnt = text.takeWhile{ it == cur }.count()
    return rle(text.substring(cnt),prev + "$cnt$cur" )
}
rle("21")

tailrec fun sayCntDigit(n: Int, acc: String = "1"): String =
    if (n == 1) acc
    else sayCntDigit(n-1, rle(acc))

sayCntDigit(1)
sayCntDigit(2)
sayCntDigit(3)
sayCntDigit(4)
sayCntDigit(9)
sayCntDigit(10)

fun rle_Regex(text: String): String {
    val r = "(.)\\1*".toRegex()
    return r.replace(text){
        "${it.range.count()}${it.groups[1]!!.value}"
    }
}
rle_Regex("21")

fun encode(s: String): String =
    s.fold(Triple(0,s[0],"")){ t,c -> val (i,p,s) = t; if (p==c) Triple(i+1,p,s) else Triple(1,c,s+i+p)}
        .let { val (i,p,s) = it; s+i+p}

fun fastEncode(s: String): String =
    s.fold(Triple(0,s[0],"")){ t,c -> val (i,p,s) = t; if (p==c) Triple(i+1,p,s) else Triple(1,c,s+i+p)}
        .let { val (i,p,s) = it; s+i+p}

encode("1")
encode("11")
encode("21")
encode("1211")
encode("111221")