class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

var tn1_1 = TN(1)
var tn1_2 = TN(2)
var tn1_3 = TN(3)
tn1_1.l = tn1_2
tn1_1.r = tn1_3

var tn2_1 = TN(1)
var tn2_2 = TN(2)
var tn2_3 = TN(3)
tn2_1.l = tn2_2
tn2_1.r = tn2_3

fun isTreeSame(p: TN?, q: TN?): Boolean =
    (p == null && q == null) ||
            ((p?.v == q?.v)
    && isTreeSame(p?.l,q?.l)
    && isTreeSame(p?.r, q?.r))

isTreeSame(tn1_1, tn2_1)

tn1_1.r = null
tn2_1.l = null
tn2_1.r = tn2_2

isTreeSame(tn1_1, tn2_1)

tn1_1.r = tn1_3
tn2_1.l = tn2_3
tn2_1.r = tn2_2

isTreeSame(tn1_1, tn2_1)