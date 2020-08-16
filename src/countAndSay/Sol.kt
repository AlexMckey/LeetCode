package countAndSay

object Solution {
    fun countAndSay(n: Int): String {
        tailrec fun rle(text: String, prev: String = ""): String {
            if (text.isEmpty()) return prev
            val cur = text[0]
            val cnt = text.takeWhile{ it == cur }.count()
            return rle(text.substring(cnt),prev + "$cnt$cur" )
        }
        tailrec fun sayCntDigit(n: Int, acc: String = "1"): String =
            if (n == 1) acc
            else sayCntDigit(n-1, rle(acc))
        return sayCntDigit(n)
    }
}