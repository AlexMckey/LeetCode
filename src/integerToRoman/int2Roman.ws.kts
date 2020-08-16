import java.lang.StringBuilder

val s = 59
var n = s
private val romans = mapOf(
    1 to "I",
    4 to "IV",
    5 to "V",
    9 to "IX",
    10 to "X",
    40 to "XL",
    50 to "L",
    90 to "XC",
    100 to "C",
    400 to "CD",
    500 to "D",
    900 to "CM",
    1000 to "M")

val sb = StringBuilder()
var i2r = romans.keys.reversed()
i2r = i2r.dropWhile { it > n }
i2r
n -= i2r[0]
sb.append(romans[i2r[0]])
i2r = i2r.dropWhile { it > n }
i2r
n -= i2r[0]
sb.append(romans[i2r[0]])
i2r = i2r.dropWhile { it > n }
i2r
//n -= i2r[0]
//sb.append(romans[i2r[0]])
//i2r = i2r.dropWhile { it > n }
//i2r
//n -= i2r[0]
//sb.append(romans[i2r[0]])
//i2r = i2r.dropWhile { it > n }
//i2r
//n -= i2r[0]
//sb.append(romans[i2r[0]])
//i2r = i2r.dropWhile { it > n }
//i2r

fun intToRoman(num: Int): String {
    val res = StringBuilder()
    var n = num
    var i2r = romans.keys.reversed()
    while (n != 0){
        i2r = i2r.dropWhile { it > n }
        n -= i2r[0]
        res.append(romans[i2r[0]])
    }
    return res.toString()
}

intToRoman(58)
intToRoman(59)
intToRoman(1994)