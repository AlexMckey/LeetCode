package romanToInteger

val romans = mapOf(
    "I" to 1,
    "IV" to 4,
    "V" to 5,
    "IX" to 9,
    "X" to 10,
    "XL" to 40,
    "L" to 50,
    "XC" to 90,
    "C" to 100,
    "CD" to 400,
    "D" to 500,
    "CM" to 900,
    "M" to 1000)

var i: Int = 0
var s = "MCMXCIV"
var p = ""
p = s.substring(0,2)
if (romans.containsKey(p)) {
    i += romans[p] ?: error("")
    s = s.substring(2)
} else {
    i += romans[s.substring(0,1)] ?: error("")
    s = s.substring(1)
}
i
s

p = s.substring(0,2)
if (romans.containsKey(p)) {
    i += romans[p] ?: error("")
    s = s.substring(2)
} else {
    i += romans[s.substring(0,1)] ?: error("")
    s = s.substring(1)
}
i
s

p = s.substring(0,2)
if (romans.containsKey(p)) {
    i += romans[p] ?: error("")
    s = s.substring(2)
} else {
    i += romans[s.substring(0,1)] ?: error("")
    s = s.substring(1)
}
i
s

p = s.substring(0,2)
if (romans.containsKey(p)) {
    i += romans[p] ?: error("")
    s = s.substring(2)
} else {
    i += romans[s.substring(0,1)] ?: error("")
    s = s.substring(1)
}
i
s