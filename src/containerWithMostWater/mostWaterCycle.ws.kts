val ia = intArrayOf(1,8,6,2,5,4,8,3,7)
//val ia = intArrayOf(1,2,1)
val len = ia.size
(0 until (len-1)).map { i -> (i+1 until len).map { j -> minOf(ia[j],ia[i]) * (j - i) }}
(0 until (len-1)).map { i -> (i+1 until len).map { j -> (ia[j] - ia[i]) * (j - i) } }
ia.withIndex().sortedByDescending { it.value } //.zipWithNext { a, b -> (a.value-b.value) * (a.index - b.index) }