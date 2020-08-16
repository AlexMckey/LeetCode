class LN(var v: Int) {
    var n: LN? = null
}

fun toList(head: LN?): List<Int>? {
    if (head == null) return null
    val vals = mutableListOf<Int>()
    var cur = head
    while (cur != null) {
        vals.add(cur.v)
        cur = cur.n
    }
    return vals
}

val l1: LN? = LN(1)
val l2 = LN(2)
val l3 = LN(3)
val l4 = LN(4)
//val l5 = LN(5)
l1?.n = l2
l2.n = l3
l3.n = l4
//l4.n = l5

//val res = LN(0)
//    .apply { n = l1 }
//
//toList(res)
//
//var cur = res.n
//var prev = res
//var cnt = 1
//
//cur!!.n == null
//"p:${prev.v} c:${cur!!.v}"
//cnt % 2 != 0
//var next = cur!!.n
//prev.n = next
//cur!!.n = next?.n
//next!!.n = cur
//cnt++
//
//toList(res)
//
//cur!!.n == null
//"p:${prev.v} c:${cur!!.v}"
//cnt % 2 != 0
//prev = cur!!
//cur = cur!!.n
//cnt++
//
//toList(res)
//
//cur!!.n == null
//"p:${prev.v} c:${cur!!.v}"
//cnt % 2 != 0
//next = cur!!.n
//prev.n = next
//cur!!.n = next?.n
//next!!.n = cur
//cnt++
//
//toList(res)
//
//cur!!.n == null
//"p:${prev.v} c:${cur!!.v}"
//cnt % 2 != 0
//prev = cur!!
//cur = cur!!.n
//cnt++
//
//toList(res)

toList(l1)

fun swapPairs(head: LN?): LN? {
    val res = LN(0)
        .apply { n = head }
    var cur = res.n
    var prev = res
    var cnt = 1
    while (cur!!.n != null){
        println("p:${prev.v} c:${cur!!.v}")
        if (cnt % 2 != 0) {
            val next = cur!!.n
            prev.n = next
            cur!!.n = next?.n
            next!!.n = cur
        } else {
            prev = cur!!
            cur = cur!!.n
        }
        cnt++
    }
    return res.n
}

val res = swapPairs(l1)
res?.v
toList(res)