package swapNodesInPairs

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

object Solution {
    // Accepted	136 ms	32.5 MB	kotlin
    // very faster - more 100%
    //Runtime: 136 ms, faster than 100.00% of Kotlin online submissions for Swap Nodes in Pairs.
    //Memory Usage: 32.5 MB, less than 75.00% of Kotlin online submissions for Swap Nodes in Pairs.
    fun swapPairs(head: ListNode?): ListNode? {
        val res = ListNode(0)
            .apply { next = head }
        var cur = res.next
        var prev = res
        var cnt = 1
        while (cur?.next != null){
            if (cnt % 2 != 0) {
                val next = cur.next
                prev.next = next
                cur.next = next?.next
                next!!.next = cur
            } else {
                prev = cur
                cur = cur.next
            }
            cnt++
        }
        return res.next
    }
}