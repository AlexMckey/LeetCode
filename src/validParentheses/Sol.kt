package validParentheses

object Solution {
//    fun isValid(s: String): Boolean {
//        val validBracketsSet = setOf("()","[]","{}")
//        val openBracketsSet = setOf("(","[","{")
//        tailrec fun checkValid(s: String, stack: List<String>): Boolean {
//            if (s.isEmpty() && stack.isEmpty()) return true
//            if (s.isEmpty() && stack.isNotEmpty()) return false
//            val ch = s.substring(0,1)
//            val rem = s.substring(1)
//            return when {
//                openBracketsSet.contains(ch) -> checkValid(rem,stack+ch)
//                stack.isEmpty() -> false
//                !validBracketsSet.contains(stack.last() + ch) -> false
//                else -> checkValid(rem,stack.dropLast(1))
//            }
//        }
//        return checkValid(s, emptyList())
//    }

    //Mach faster
    fun isValid(parenString: String): Boolean {
        val st = mutableListOf<Char>()

        parenString.forEach { bracket ->
            when (bracket) {
                '(' -> st.add(')')
                '[' -> st.add(']')
                '{' -> st.add('}')
                in ")]}" -> {
                    if (st.isEmpty()) return false
                    if (st.removeAt(st.lastIndex) != bracket) return false
                }
            }
        }

        return st.isEmpty()
    }
}