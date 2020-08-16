@file:Suppress("PropertyName", "PropertyName", "PropertyName", "PropertyName")

package mergeTwoSortedLists

class ListNode(var v: Int) {
    var n: ListNode? = null}

var l1: ListNode? = ListNode(1)
var l2: ListNode? = ListNode(1)
val l1_2 = ListNode(2)
val l2_2 = ListNode(3)
val l1_3 = ListNode(4)
val l2_3 = ListNode(4)
l1?.n = l1_2
l1_2.n = l1_3
l2?.n = l2_2
l2_2.n = l2_3

var cur: ListNode? = null
var res: ListNode? = null

if (l1?.v ?: Int.MIN_VALUE <= l2?.v ?: Int.MAX_VALUE){
    res = l1
    l1 = l1?.n
    cur?.n = null
} else {
    res = l2
    l2 = l2?.n
    cur?.n = null
}
cur = res
l1 == null
l2 == null
if (l1 == null) cur?.n = l2
if (l2 == null) cur?.n = l1

l1?.v
l2?.v
if (l1?.v ?: Int.MIN_VALUE <= l2?.v ?: Int.MAX_VALUE){
    cur?.n = l1
    cur = l1
    l1 = l1?.n
    cur?.n = null
} else {
    cur?.n = l2
    cur = l2
    l2 = l2?.n
    cur?.n = null
}
l1 == null
l2 == null
if (l1 == null) cur?.n = l2
if (l2 == null) cur?.n = l1

l1?.v
l2?.v
if (l1?.v ?: Int.MIN_VALUE <= l2?.v ?: Int.MAX_VALUE){
    cur?.n = l1
    cur = l1
    l1 = l1?.n
    cur?.n = null
} else {
    cur?.n = l2
    cur = l2
    l2 = l2?.n
    cur?.n = null
}
l1 == null
l2 == null
if (l1 == null) cur?.n = l2
if (l2 == null) cur?.n = l1

l1?.v
l2?.v
if (l1?.v ?: Int.MIN_VALUE <= l2?.v ?: Int.MAX_VALUE){
    cur?.n = l1
    cur = l1
    l1 = l1?.n
    cur?.n = null
} else {
    cur?.n = l2
    cur = l2
    l2 = l2?.n
    cur?.n = null
}
l1 == null
l2 == null
if (l1 == null) cur?.n = l2
if (l2 == null) cur?.n = l1

l1?.v
l2?.v
if (l1?.v ?: Int.MIN_VALUE <= l2?.v ?: Int.MAX_VALUE){
    cur?.n = l1
    cur = l1
    l1 = l1?.n
    cur?.n = null
} else {
    cur?.n = l2
    cur = l2
    l2 = l2?.n
    cur?.n = null
}
l1 == null
l2 == null
if (l1 == null) cur?.n = l2
if (l2 == null) cur?.n = l1

res?.v
res = res?.n
res?.v
res = res?.n
res?.v
res = res?.n
res?.v
res = res?.n
res?.v
res = res?.n
res?.v
res = res?.n
res?.v
res = res?.n
