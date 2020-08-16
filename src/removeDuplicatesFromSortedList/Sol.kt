package removeDuplicatesFromSortedList

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
    // Accepted	216 ms	34.3 MB	kotlin
    //Runtime: 216 ms, faster than 29.09% of Kotlin online submissions for Remove Duplicates from Sorted List.
    //Memory Usage: 34.3 MB, less than 28.57% of Kotlin online submissions for Remove Duplicates from Sorted List.
//    fun deleteDuplicates(head: ListNode?): ListNode? {
//        if (head == null) return head
//        val res: ListNode = ListNode(head.`val`)
//        var prev = res
//        var cur = head
//        while (cur != null){
//            if (prev.`val` != cur.`val`){
//                prev.next = cur
//                prev = prev.next!!
//            }
//            cur = cur.next
//        }
//        prev.next = null
//        return res.next
//    }

    // faster
    // Accepted	184 ms	34 MB	kotlin
    //Runtime: 184 ms, faster than 72.73% of Kotlin online submissions for Remove Duplicates from Sorted List.
    //Memory Usage: 34 MB, less than 57.14% of Kotlin online submissions for Remove Duplicates from Sorted List.
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return head
        var cur = head
        while (cur?.next != null) {
            if (cur.`val` == cur.next?.`val`)
                cur.next = cur.next?.next
            else
                cur = cur.next
        }
        return head
    }
}