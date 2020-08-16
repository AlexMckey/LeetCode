import kotlin.math.max

val arr = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
@OptIn(ExperimentalStdlibApi::class)
val t = arr.toList().runningReduce { a, b -> max(a + b, b) }
t
t.max()
val res = arr.drop(1).fold(arr[0] to arr[0]){
        acc, i ->
    max(acc.first,max(acc.second + i, i)) to max(acc.second + i, i)
}
res.first