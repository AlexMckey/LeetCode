var s = "9223372036854775808"
s = s.trim()
s
var i = 0
val a = s[i]-'0'
s[i]
a
'4' - '0'
s[i]-'0'
val k = when(s[i]) {
    '-' -> {
        i++
        -1
    }
    '+' -> {
        i++
        1
    }
    else -> 1
}

var res = 0L
while (i < s.length && s[i].isDigit()) {
    res = s[i] - '0' + res * 10
    println("res:$res")
    i++
}
res *= k
println("res:$res")
println("res:${res.toInt()}")
when {
    res > Int.MAX_VALUE -> Int.MAX_VALUE
    res < Int.MIN_VALUE -> Int.MIN_VALUE
    else -> res.toInt()
}