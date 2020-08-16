class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

var tn1 = TN(1)
var tn2 = TN(2)
var tn3 = TN(2)
var tn4 = TN(3)
var tn5 = TN(3)
var tn6 = TN(4)
var tn7 = TN(4)
tn1.l = tn2
tn1.r = tn3
tn2.l = tn4
tn2.r = tn6
tn3.l = tn7
tn3.r = tn5

fun isTreeSymm(p: TN?, q: TN?): Boolean =
    (p == null && q == null) ||
            ((p?.v == q?.v)
                    && isTreeSymm(p?.l, q?.r)
                    && isTreeSymm(p?.r, q?.l))

fun isSymTree(root: TN?): Boolean =
    if (root == null) true
    else isTreeSymm(root.l,root.r)

fun treeToList(root: TN?): List<Int> =
    if (root == null) emptyList()
    else treeToList(root.l) + root.v + treeToList(root.r)

fun checkSymm(l: List<Int>): Boolean {
    val len = l.size
    for (i in 0 .. len / 2)
        if (l[i] != l[len-1-i]) return false
    return true
}

isSymTree(tn1)
val l1 = treeToList(tn1)
l1
checkSymm(l1)

tn1.l = tn2
tn1.r = tn3
tn2.l = tn4
tn2.r = tn6
tn3.l = tn5
tn3.r = tn7

isSymTree(tn1)
val l2 = treeToList(tn1)
l2
checkSymm(l2)
