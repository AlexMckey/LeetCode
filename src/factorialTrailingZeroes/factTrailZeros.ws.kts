import java.math.BigInteger
import kotlin.math.ln
import kotlin.math.log

val n = 126
fun f1(n: Int) =
    (1..n).fold(BigInteger.ONE){
        acc, i -> acc * BigInteger.valueOf(i.toLong())
    }.toString().takeLastWhile { it == '0' }.count()
f1(n)

tailrec fun div5(num: Int, acc: List<Int> = emptyList()): List<Int> =
    if (num == 0) acc.drop(1)
    else div5(num / 5, acc + num % 5)

tailrec fun trailZeros(num: Int, acc: Int = 0): Int =
    if (num == 0) acc
    else trailZeros(num / 5,acc + num / 5)

fun comp(n: Int): Triple<List<Int>,Int,Int> =
Triple(div5(n), trailZeros(n), if (n <= 3125) f1(n) else 0)

f1(3127)
comp(31)
comp(51)
comp(76)
comp(101)
comp(125)
comp(555)
comp(625)
comp(3125)
comp(3125*5)
comp(3125*5*5)
comp(3125*5*5*5)
comp(3125*5*5*5*5)
comp(1808548329)

div5(1808548329).fold(1 to 0) {
    acc, i -> acc.first*5+1 to acc.second + acc.first * i
}

tailrec fun divs(num: Int, cur: Int = 0, acc: Int = 0): Int =
    if (num == 0) acc
    else divs(num / 5, cur * 5 + 1, acc + num % 5 * cur)

fun d(num: Int): Int {
    var n = num
    var res = 0
    while (n != 0) {
        res += n / 5
        n /= 5
    }
    return res
}

divs(555)
divs(1808548329)
d(1808548329)