class LN(var v: Int) {
    var n: LN? = null
}

val l1: LN? = LN(1)
val l2 = LN(2)
val l3 = LN(3)
val l4 = LN(4)
val l5 = LN(5)
l1?.n = l2
l2.n = l3
l3.n = l4
l4.n = l5

val k = 5
var cur: LN? = l1
val nodes = mutableListOf<LN?>()
while (cur != null) {
    nodes.add(cur!!)
    cur = cur!!.n
}
nodes.add(null)
nodes.map { it?.v }
nodes[nodes.size-k-1]?.v
if (nodes.size-k-2 >= 0) {
    nodes[nodes.size - k - 2]?.n = nodes[nodes.size - k]
}
val vals = mutableListOf<Int>()
cur = nodes.first()
while (cur != null) {
    vals.add(cur!!.v)
    cur = cur!!.n
}
vals