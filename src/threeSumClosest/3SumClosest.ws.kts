import kotlin.math.absoluteValue

var nums = intArrayOf(-1,2,1,-4)
val t = -10
var ia = nums.sorted()
var res = 0
var maxDelta = Int.MAX_VALUE
val len = ia.size
for (i in 0 .. len - 3) {
    var l = i + 1
    var r = len - 1
    while (l < r) {
        val sum = listOf(ia[i], ia[l], ia[r]).sum()
        when {
            sum == t -> res = sum // return
            sum < t -> l++
            else -> r--
        }
        if (t - sum < maxDelta) res = sum
    }
}
res

fun threeSumClosest(nums: IntArray, t: Int): Int {
    val ia = nums.sorted()
    var res = 0
    var delta = Int.MAX_VALUE
    val len = ia.size
    for (i in 0 .. (len-2)) {
        var l = i + 1
        var r = len - 1
        while (l < r) {
            val sum = ia[i] + ia[l] + ia[r]
            when {
                sum == t -> return t
                sum < t -> ++l
                else -> --r
            }
            if ((t - sum).absoluteValue < delta) {
                delta = (t - sum).absoluteValue
                res = sum
            }
        }
    }
    return res
}

threeSumClosest(intArrayOf(-1,2,1,-4),1)
threeSumClosest(intArrayOf(-1,2,1,-4),2)
threeSumClosest(intArrayOf(-1,2,1,-4),3)
threeSumClosest(intArrayOf(-1,2,1,-4),0)
threeSumClosest(intArrayOf(-1,2,1,-4),-4)
threeSumClosest(intArrayOf(-1,2,1,-4),-3)
threeSumClosest(intArrayOf(-1,2,1,-4),-1)
threeSumClosest(intArrayOf(-1,2,1,-4),-2)
threeSumClosest(intArrayOf(-1,2,1,-4),-10)
(-10..10).map { threeSumClosest(intArrayOf(-1,2,1,-4),it) }