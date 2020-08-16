var q = intArrayOf(1,2,3,4,5,6,7)
q.toList()

fun reverse(a: IntArray, from: Int = 0, to: Int? = null): Unit {
    var i = from
    var j = to ?: a.size-1
    while(i < j)
    {
        val t = a[i]
        a[i++] = a[j]
        a[j--] = t
    }
}

reverse(q)
reverse(q,0,2)
reverse(q,3)
q.toList()