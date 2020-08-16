package romanToInteger

object Solution {
    private val romans = mapOf(
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

    //Accepted	240 ms	34.7 MB	kotlin
    fun romanToInt(s: String): Int {
        var res = 0
        var tail = s
        while (tail.isNotEmpty()) {
            if (tail.length >= 2 && romans.containsKey(tail.substring(0,2))) {
                res += romans[tail.substring(0,2)] ?: error("")
                tail = tail.substring(2)
            } else {
                res += romans[tail.substring(0,1)] ?: error("")
                tail = tail.substring(1)
            }
        }
        return res
    }
}