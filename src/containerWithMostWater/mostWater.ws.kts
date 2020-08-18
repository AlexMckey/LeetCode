//val ia = intArrayOf(1,8,6,2,5,4,8,3,7)
val ia = intArrayOf(1,1,1,1,1,7,8,1,1)

val len = ia.size

data class State(val i: Int = 0, val power: Int = 0)

val maxp = ia
    .foldIndexed( (0 to 0) to (0 to 0)) { i, acc, v ->
    val l = v*(i+1)
    val r = v*(len-i)
    (if (acc.first.second < r) (i to r) else acc.first) to
            (if (acc.second.second < l && acc.first.first < i) (i to l) else acc.second)
}
maxp

val res = (maxp.second.first - maxp.first.first) * minOf(ia[maxp.first.first],ia[maxp.second.first])
res

val s = ia.mapIndexed {
    i, v -> v*(i+1) to v*(len-i)
}
s
s.map { it.first+it.second }
val left = s.maxByOrNull { it.second }!!
val right = s.maxByOrNull { it.first }!!
left
right
right.first - left.first
(0 until (len-1)).map { i -> (i+1 until len).map { j -> minOf(ia[j],ia[i]) * (j - i) }.maxOrNull()!!}.maxOrNull()