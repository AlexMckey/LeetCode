class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

val ia = intArrayOf(-10,-3,0,5,7,9)

var u = ia.size
var d = 1
var m = (d + u) / 2
m

fun conv(d: Int, u: Int): TN? {
    return when (u - d + 1) {
        3 -> {
            val res = TN(ia[d])
            val res1 = TN(ia[d-1])
            val res2 = TN(ia[d+1])
            res.l = res1
            res.r = res2
            res }
        2 -> {
            val res = TN(ia[d])
            val res1 = TN(ia[d-1])
            res.l = res1
            res
        }
        1 -> TN(ia[d-1])
        0 -> null
        else -> {
            val m = (d + u) / 2
            val res = TN(ia[m-1])
            res.l = conv(d,m-1)
            res.r = conv(m+1,u)
            res
        }
    }
}

fun treeToList(root: TN?): List<Int> =
    if (root == null) emptyList()
    else treeToList(root.l) + root.v + treeToList(root.r)

treeToList(conv(1,ia.size))
