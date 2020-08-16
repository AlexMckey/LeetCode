package letterCombinationsOfAPhoneNumber

object Solution {
    // Accepted	180 ms	34.7 MB	kotlin
    //Runtime: 180 ms, faster than 73.38% of Kotlin online submissions for Letter Combinations of a Phone Number.
    //Memory Usage: 34.7 MB, less than 84.62% of Kotlin online submissions for Letter Combinations of a Phone Number.
    fun letterCombinations(digits: String): List<String> {
        val phoneKeys = mapOf(
            '1' to "".map(Char::toString),
            '2' to "abc".map(Char::toString),
            '3' to "def".map(Char::toString),
            '4' to "ghi".map(Char::toString),
            '5' to "jkl".map(Char::toString),
            '6' to "mno".map(Char::toString),
            '7' to "pqrs".map(Char::toString),
            '8' to "tuv".map(Char::toString),
            '9' to "wxyz".map(Char::toString),
            '0' to " ".map(Char::toString)
        )
        fun cartesianProductForReduce(s1: List<String>, s2: List<String>): List<String> =
            if (s1.isNullOrEmpty()) s1
            else s1.flatMap { a -> s2.map { b -> "$a$b" } }
        return if (digits.isEmpty()) emptyList()
        else digits.map { phoneKeys[it]?: emptyList() }.reduce(::cartesianProductForReduce)
    }
}