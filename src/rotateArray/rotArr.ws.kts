val ia = intArrayOf(1,2,3,4,5,6,7)
val a = IntArray(ia.size)
ia.copyInto(a)
a.toList()
val k = 3

val h = ia.takeLast(k)
val t = ia.dropLast(k)
val res = h + t
//res.toIntArray().copyInto(ia)
ia.toList()
ia.sliceArray(ia.indices.drop(ia.size - k-1)).toList()
ia.sliceArray(ia.indices.drop(ia.size - k)+ia.indices.take(ia.size - k)).toList()

var q = intArrayOf(1,2,3,4,5,6,7)
val m = mutableListOf<Int>()
val newidx = q.indices.map { (it + q.size - 3)%q.size }
q.indices
newidx
q.sliceArray(newidx).toList()