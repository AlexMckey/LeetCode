val cache = emptyMap<Long,Int>()
tailrec fun multDigit(num: Long, step: Int = 0): Int {
    if (num / 10L == 0L) return step
    val n = num.toString()
        .map { (it-'0').toLong() }
        .reduce { a, b -> a * b }
    //println(n)
    if (cache.containsKey(n)) return step + cache[n]!!
    return multDigit(n, step+1)
}

val n = 7965
n.toString()
.map { (it-'0').toLong() }
.reduce { a,b -> a*b }
multDigit(7965)
val ns = 0 to 10000
List<Long>(10000){ i -> i.toLong()}
    .map {
    val cnt = multDigit(it)
    //if (!cache.containsKey(n)) cache[it] = cnt
    it to cnt }
    //.sortedByDescending { it.second }
    .groupingBy { it.second }.eachCount()
multDigit(49)