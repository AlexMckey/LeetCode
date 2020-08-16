import kotlin.test.currentStackTrace

val arr = intArrayOf(9)
val rs = arr.clone()
rs[rs.lastIndex] += 1
rs.toList()
val r = arr
    .foldRight(emptyList<Int>() to 1){i, acc ->
    val ci = acc.second + i
    if (ci < 10) acc.first + ci to 0
    else acc.first + ci % 10 to 1
}
var rr = if (r.second == 1) r.first + 1
else r.first
rr
rr.reversed()
@OptIn(ExperimentalStdlibApi::class)
arr.toList().asReversed().fold(emptyList<Int>() to 1)
{acc, i -> acc.first + (acc.second + i) % 10 to (acc.second + i) / 10 }
var curry = 1
val res = Array(arr.size+1){ 0 }
res.toList()
for (i in arr.indices.reversed()){
    val c = curry + arr[i]
    res[i+1] = c % 10
    curry = c / 10
}
if (curry > 0) res[0] = curry
if (curry > 0) res.toList()
else res.sliceArray(res.indices.drop(1)).toList()