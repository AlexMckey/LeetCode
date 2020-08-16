package lengthOfLastWord

object Solution {
    fun lengthOfLastWord(s: String): Int =
        s.trim().takeLastWhile { it.isLetter() }.length
}