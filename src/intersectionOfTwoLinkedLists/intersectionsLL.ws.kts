import intersectionOfTwoLinkedLists.ListNode

val l1 = ListNode(4)
val l2 = ListNode(1)
val l3 = ListNode(5)
val l4 = ListNode(6)
val l5 = ListNode(1)
val l6 = ListNode(8)
val l7 = ListNode(4)
val l8 = ListNode(5)
l1.next = l2
l2.next = l6
l3.next = l4
l4.next = l5
l5.next = l6
l6.next = l7
l7.next = l8

val hs = hashSetOf<ListNode>()
var lf: ListNode? = l1
var ls: ListNode? = l3

while (lf != null){
    hs.add(lf!!)
    lf = lf?.next
}

while (ls != null){
    if (hs.contains(ls!!)) break
    ls = ls?.next
}

ls?.`val`