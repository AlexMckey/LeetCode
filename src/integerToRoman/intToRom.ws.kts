import java.lang.StringBuilder

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
    900  to "CM",
    1000 to "M")

val n = 58

var res = StringBuilder()
var d = 1000
var h = n / d
var l = n % d
"d:$d h:$h l:$l"
d /= 10
h = n / d
l = n % d
"d:$d h:$h l:$l"
d /= 10
h = n / d
l = n % d
"d:$d h:$h l:$l"

d /= 10
h = n / d
l = n % d
"d:$d h:$h l:$l"