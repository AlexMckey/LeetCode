import kotlin.math.abs

class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

fun treeToList(root: TN?): List<Int> =
    if (root == null) emptyList()
    else treeToList(root.l) + root.v + treeToList(root.r)

//
var tn1 = TN(1)
var tn2 = TN(2)
var tn3 = TN(2)
var tn4 = TN(3)
var tn7 = TN(4)
tn1.l = tn2
tn1.r = tn3
tn3.r = tn4
tn3.l = tn7

fun dBT(t: TN?): Triple<Int,Int,Boolean> {
    if (t == null)  return Triple(0,0,false)
    else {
        val hl = if (t.l != null) 1 else 0
        val hr = if (t.r != null) 1 else 0
        val dl = dBT(t.l)
        if (dl.third) return Triple(0,0,true)
        val dr = dBT(t.r)
        if (dr.third) return Triple(0,0,true)
        var l = hl+dl.first+dr.first
        val r = hr+dl.second+dr.second
        if (abs(l - r) > 1) return Triple(0,0,true)
        return Triple(l,r,false)
    }
}

dBT(tn1)

//
var t1 = TN(1)
var t2 = TN(3)
var t3 = TN(2)
t1.r = t2
t2.l = t3

dBT(t1)