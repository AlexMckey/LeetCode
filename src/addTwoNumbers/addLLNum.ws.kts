import addTwoNumbers.ListNode
import java.lang.StringBuilder

fun llToString(l: ListNode?): String {
    var p: ListNode? = l ?: return "[]"
    val sb = StringBuilder().append('[')
    var firstRun = true
    do {
        if (!firstRun) 
            sb.append(" -> ")
        else firstRun = false 
        sb.append(p!!.`val`)
        p = p.next
    } while (p != null)
    return sb.append(']').toString()
}

val l1 = ListNode(2)
l1.next = ListNode(4)
l1.next?.next = ListNode(3)
val l2 = ListNode(5)
l2.next = ListNode(6)
l2.next?.next = ListNode(4)

llToString(l1)
llToString(l2)

fun add(l1: ListNode?, l2: ListNode?): ListNode? {
    val r = ListNode(0)
    var cur = r
    var i = l1
    while (i != null) {
        cur.next = ListNode(i.`val`)
        cur = cur.next!!
        i = i.next
    }
    println(llToString(r))
    var carry = 0
    cur = r
    i = l2
    while (i != null) {
        if (cur.next == null /*&& i != null*/)
            cur.next = ListNode(i.`val`)
        else cur.next!!.`val` += i.`val` + carry
        cur = cur.next!!
        if (cur.`val` >= 10) {
            carry = cur.`val` / 10
            cur.`val` = cur.`val` % 10
        }
        i = i.next
    }
    println(llToString(r))
    if (carry != 0)
        cur.next = ListNode(carry)
    return r.next
}

val res = add(l1,l2)
llToString(res)