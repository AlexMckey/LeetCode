package intersectionOfTwoLinkedLists

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
    // Accepted	192 ms	36.6 MB	kotlin
    //Runtime: 192 ms, faster than 48.89% of Kotlin online submissions for Intersection of Two Linked Lists.
    //Memory Usage: 36.6 MB, less than 78.26% of Kotlin online submissions for Intersection of Two Linked Lists.
//    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
//        val hs = hashSetOf<ListNode>()
//        var lf: ListNode? = headA
//        var ls: ListNode? = headB
//
//        while (lf != null){
//            hs.add(lf)
//            lf = lf.next
//        }
//
//        while (ls != null){
//            if (hs.contains(ls)) break
//            ls = ls.next
//        }
//
//        return ls
//    }

    // mach faster and simple
    // 156 ms	37.4 MB	kotlin
    //Runtime: 156 ms, faster than 97.78% of Kotlin online submissions for Intersection of Two Linked Lists.
    //Memory Usage: 37.4 MB, less than 26.09% of Kotlin online submissions for Intersection of Two Linked Lists.
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var a = headA
        var b = headB

        while (a != b){
            a = if (a != null) a.next else headB
            b = if (b != null) b.next else headA
        }

        return a
    }
}