var str = "abcabcbb"
val chars = str.toSet()
chars
val ch = chars.first()

val sp = "a".split('a')
val res = listOf(sp.first()+'a') + sp.drop(1).dropLast(1).flatMap { listOf("a$it",it+'a') } + listOf('a'+sp.last())
res.distinct()

fun spl(s: String, ch: Char): List<String> {
    return when {
        s.isEmpty() -> emptyList()
        s.indexOf(ch) < 0 -> listOf(s)
        else -> listOf(ch.toString()) + s.split(ch).windowed(2,1).map { it.joinToString(ch.toString()) }
    }
}

fun splt(s: String, ch: Char): List<String> {
    return when {
        s.isEmpty() -> emptyList()
        s.indexOf(ch) < 0 -> listOf(s)
        else -> /*listOf(ch.toString()) +*/ s.split(ch).zipWithNext { a, b -> "$a$ch$b" }
    }
}

fun lenLongSubs(s: String): Int =
    if (s.length == 1) 1
    else s.toSet().fold(listOf(s)){
            acc, c -> acc.flatMap { spl(it,c) }.distinct()}
        .map { it.length }.max()!!

var ls = listOf(str)
ls
ls = ls.flatMap { spl(it,'a') }.distinct()
ls
ls = ls.flatMap { spl(it,'b') }.distinct()
ls
ls = ls.flatMap { spl(it,'c') }.distinct()
ls

var subs = chars.fold(listOf(str)){
    acc, c -> acc.flatMap { spl(it,c) }.distinct()
}
subs
subs.map { it.length }.max()

spl("a",'b')
spl("abc",'b')
spl("bca",'b')
spl("abcbb",'b')
"abcabcbb".split('a').windowed(2,1).map { it.joinToString('a'.toString()) }
"abcbb".split('b').windowed(2,1).map { it.joinToString('b'.toString()) }

"pwwkew".split('p').windowed(2,1).map { it.joinToString('p'.toString()) }
"pwwkew".split('w').windowed(2,1).map { it.joinToString('w'.toString()) }

lenLongSubs("abcabcbb")
lenLongSubs("pwwkew")
lenLongSubs("bbbbb")

splt("pwwkew",'p')
splt("pwwkew",'w')
splt("wke",'k')
splt("kew",'k')

spl("pwwkew",'p')
spl("pwwkew",'w')
spl("wke",'k')
spl("kew",'k')

subs = "pwwkew".toSet().fold(listOf("pwwkew")){
        acc, c -> acc.flatMap { spl(it,c) }.distinct()
}
subs
subs.map { it.length }.max()