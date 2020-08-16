@file:Suppress("PropertyName", "PropertyName", "PropertyName", "PropertyName")

class ListNode(var v: Int) {
    var n: ListNode? = null}

var l: ListNode? = ListNode(0)
var l1 = ListNode(1)
var l2 = ListNode(2)
var l3 = ListNode(3)
var l4 = ListNode(3)
l?.n = l1
l1.n = l2
l2.n = l3
l3.n = l4
//
//val res: ListNode? = ListNode(0)
//var prev = res
//var cur: ListNode? = l1
//
//cur?.n == null
//prev?.v == cur?.v
//if (prev?.v != cur?.v){
//    prev?.n = cur
//    prev = prev?.n
//}
//cur = cur?.n
//prev?.v
//cur?.v
//
//cur?.n == null
//prev?.v == cur?.v
//if (prev?.v != cur?.v){
//    prev?.n = cur
//    prev = prev?.n
//}
//cur = cur?.n
//prev?.v
//cur?.v
//
//cur?.n == null
//prev?.v == cur?.v
//if (prev?.v != cur?.v){
//    prev?.n = cur
//    prev = prev?.n
//}
//cur = cur?.n
//prev?.v
//cur?.v
//
//cur?.n == null
//prev?.n = null
//res?.n?.v
//
fun ListNode?.toArray(): Array<Int>? {
    val l = mutableListOf<Int>()
    var p: ListNode? = this ?: return emptyArray()
    do {
        l.add(p!!.v)
        p = p.n
    } while (p != null)
    return l.toTypedArray()
}
//
//res?.n.toArray()?.toList()

fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head == null) return head
    val r: ListNode = ListNode(head.v)
    var p = r
    var c = head
    while (c != null){
        println("${p.v}:${c.v}")
        if (p.v != c.v){
            p.n = c
            p = c
        }
        c = c.n
    }
    p.n = null
    return r
}

//l = ListNode(1)
//l1 = ListNode(1)
//l2 = ListNode(2)
//l3 = ListNode(3)
//l4 = ListNode(3)
//l?.n = l1
//l1.n = l2
//l2.n = l3
//l3.n = l4

val rr = deleteDuplicates(l)
rr.toArray()?.toList()