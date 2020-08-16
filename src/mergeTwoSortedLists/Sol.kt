@file:Suppress("unused")

package mergeTwoSortedLists

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun fromList(l: List<Int>): ListNode? =
            if (l.isEmpty()) null
            else l.map { ListNode(it) }.reversed().reduce{
                    l1,l2 -> l2.next = l1; l2}
    }
}

object Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val res = ListNode(0)
        var p1 = l1
        var p2 = l2
        var cur = res

        while (p1 != null && p2 != null) {
            if (p1.`val` <= p2.`val`) {
                cur.next = p1
                cur = p1
                p1 = p1.next
            } else {
                cur.next = p2
                cur = p2
                p2 = p2.next
            }
        }
        cur.next = p1 ?: p2
        return res.next
    }
}