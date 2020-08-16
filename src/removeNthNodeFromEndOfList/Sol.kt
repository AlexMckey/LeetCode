package removeNthNodeFromEndOfList
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
    // Accepted	172 ms	33.8 MB	kotlin
    //Runtime: 172 ms, faster than 69.94% of Kotlin online submissions for Remove Nth Node From End of List.
    //Memory Usage: 33.8 MB, less than 66.67% of Kotlin online submissions for Remove Nth Node From End of List.
    // Simple but use O(n) memory
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var cur: ListNode? = head
        val nodes = mutableListOf<ListNode?>()
        while (cur != null) {
            nodes.add(cur)
            cur = cur.next
        }
        nodes.add(null)
        if (nodes.size-n-2 < 0) return nodes[1]
        nodes[nodes.size-n-2]?.next = nodes[nodes.size-n]
        return nodes[0]
    }

    // more correct algorithm
    // with two pointers
    fun removeNthFromEndCorrect(head: ListNode?, n: Int): ListNode? {
        val res = ListNode(0)
            .apply { next = head }
        var firstPointer: ListNode? = res
        var lastNPointer: ListNode? = res
        repeat(n+1) { firstPointer = firstPointer?.next }
        while (firstPointer != null){
            firstPointer = firstPointer?.next
            lastNPointer = lastNPointer?.next
        }
        lastNPointer!!.next = lastNPointer.next?.next
        return res.next
    }
}