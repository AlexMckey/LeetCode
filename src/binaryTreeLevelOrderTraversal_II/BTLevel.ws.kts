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
var tn8 = TN(5)
tn1.l = tn2
tn1.r = tn3
tn2.l = tn4
tn2.r = tn6
tn3.l = tn7
tn3.r = tn5
tn5.r = tn8

fun treeToList(root: TN?, lvl: Int = 0): List<Pair<Int,Int>> =
    if (root == null) emptyList()
    else treeToList(root.l, lvl+1) + (root.v to lvl) + treeToList(root.r, lvl+1)

treeToList(tn1)
    .groupBy({it.second},{it.first})
    .toSortedMap().values.reversed()