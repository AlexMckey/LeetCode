import kotlin.math.max

class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

var tn1 = TN(1)
var tn2 = TN(2)
var tn3 = TN(2)
var tn4 = TN(3)
var tn7 = TN(4)
tn1.l = tn2
tn1.r = tn3
tn3.r = tn4
tn3.l = tn7

fun maxDepth(root: TN?, acc: Int = 0): Int =
    if (root == null) acc
    else max(maxDepth(root.l, acc+1),maxDepth(root.r,acc+1))

maxDepth(tn1)