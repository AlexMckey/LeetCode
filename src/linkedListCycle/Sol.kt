package linkedListCycle

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
    // Пускаем два указателя. Один бнжит быстрее чем другой. Если они встретились, то цикл есть
    // Accepted	172 ms	33.7 MB	kotlin
    //Runtime: 172 ms, faster than 94.03% of Kotlin online submissions for Linked List Cycle.
    //Memory Usage: 33.7 MB, less than 100.00% of Kotlin online submissions for Linked List Cycle.
    fun hasCycle(head: ListNode?): Boolean {
        var r1 = head
        var r2 = head
        var fCycle = false
        do {
            r1 = r1?.next
            r2 = r2?.next?.next
            if (r1 != null && r1 == r2) {
                fCycle = true
                break
            }
        } while (r2 != null)
        return fCycle
    }
}