class LN(var v: Int) {
    var n: LN? = null
}

val l: LN? = LN(3)
val l1 = LN(2)
val l2 = LN(0)
val l3 = LN(-4)
l?.n = l1
l1.n = l2
l2.n = l3
l3.n = l1

var r1 = l
var r2 = l
var fCycle = false
while (r2 != null){
    if (r1 == r2) {
        fCycle = true
        break
    }
    r1 = r1?.n
    r2 = r2?.n?.n
}
fCycle