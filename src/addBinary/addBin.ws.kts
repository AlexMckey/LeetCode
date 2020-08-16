import java.lang.StringBuilder

val a = "1010"
val b = "1011"
var r = emptyList<Int>()
var i = emptyList<Int>()
if (a.length > b.length) {
    r = a.map { it-'0' }
    i = b.padStart(a.length, '0')
        .map { it-'0' }
} else {
    r = b.map { it-'0' }
    i = a.padStart(b.length, '0')
        .map { it-'0' }
}
r
i
b.padStart(a.length, '0').map { it-'0' }.zip(a.padStart(b.length, '0').map { it-'0' },Int::plus).reversed()
r.zip(i,Int::plus).reversed()
    .fold(StringBuilder() to 0) {
        acc, i ->
        //val n = acc.second + i
//        when (n) {
//            2 -> acc.first.append(0) to 1
//            3 -> acc.first.append(1) to 1
//            else -> acc.first.append(n) to 0
//        }
        acc.first.append((acc.second+i)%2) to (acc.second+i)/2
    }.let { (if (it.second == 1) it.first.append(1)
             else it.first)
        .reverse().toString() }