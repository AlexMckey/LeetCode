//val ia = intArrayOf(4,1,2,1,2)
val ia = intArrayOf(2,4,2)

val l = ia.toList()
l.zipWithNext { a, b -> a - b }.sum()
l.windowed(2,2).map { it[0]-it[1] }
ia.groupBy { it }.minBy { it.value.size }?.key
ia.fold(0,Int::xor)