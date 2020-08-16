package addTwoNumbers

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
    // Accepted	244 ms	36.4 MB	kotlin
    //Runtime: 244 ms, faster than 52.32% of Kotlin online submissions for Add Two Numbers.
    //Memory Usage: 36.4 MB, less than 93.67% of Kotlin online submissions for Add Two Numbers.
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val r = ListNode(0)
        var cur: ListNode? = r
        var i = l1
        while (i != null) {
            cur!!.next = ListNode(i.`val`)
            cur = cur.next
            i = i.next
        }
        var carry = 0
        cur = r
        i = l2
        while (i != null) {
            if (cur!!.next == null)
                cur.next = ListNode(i.`val` + carry)
            else cur.next!!.`val` += i.`val` + carry
            cur = cur.next!!
            if (cur.`val` >= 10) {
                carry = cur.`val` / 10
                cur.`val` = cur.`val` % 10
            } else carry = 0
            i = i.next
        }
        if (carry != 0 && cur?.next != null)
            while (cur?.next != null && carry != 0){
                val n = cur!!.next!!.`val` + carry
                cur.next!!.`val` = n % 10
                carry = n / 10
                cur = cur.next
            }
        if (carry != 0 && cur!!.next == null)
            cur.next = ListNode(carry)
        return r.next
    }

    // more clearly
    fun addTwoNumbersClearly(l1: ListNode?, l2: ListNode?): ListNode? {
        var i = l1
        var j = l2
        var carry = 0
        val res = ListNode(0)
        var r: ListNode? = res
        while (i != null || j != null || carry > 0) {
            carry += (i?.`val` ?: 0) + (j?.`val` ?: 0)
            r?.next = ListNode(carry % 10)
            r = r?.next
            carry /= 10
            i = i?.next
            j = j?.next
        }
        return res.next
    }
}