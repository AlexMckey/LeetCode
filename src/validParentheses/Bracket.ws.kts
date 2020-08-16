package validParentheses

var s = "()"
val validBracketsSet = setOf("()","[]","{}")
val openBracketsSet = setOf("(","[","{")
validBracketsSet.contains(s)
tailrec fun checkValid(s: String, stack: List<String>): Boolean {
    if (s.isEmpty() && stack.isEmpty()) return true
    if (s.isEmpty() && stack.isNotEmpty()) return false
    val ch = s.substring(0,1)
    val rem = s.substring(1)
    return when {
        openBracketsSet.contains(ch) -> checkValid(rem,stack+ch)
        stack.isEmpty() -> false
        !validBracketsSet.contains(stack.first() + ch) -> false
        else -> checkValid(rem,stack.drop(1))
    }
}
checkValid(s, emptyList())
s = "(]"
checkValid(s, emptyList())