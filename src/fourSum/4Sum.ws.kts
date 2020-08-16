import kotlin.math.absoluteValue

fun checkFromBothSide(ia: List<Int>, i: Int, j: Int, t: Int, res: MutableList<List<Int>>) {
    var l = i + 1
    var r = j - 1
    while (l < r) {
        val idxs = listOf(i, l, r, j)
        val list = ia.slice(idxs)
        val sum = list.sum()
        println("is:$idxs l:$list s:$sum")
        if (sum < t || l > i + 1 && ia[l] == ia[l - 1])
            ++l
        else if (sum > t || r < j - 1 && ia[r] == ia[r + 1])
            --r
        else {
            res.add(list)
            ++l
            --r
        }
    }
}

var a = intArrayOf(-3,-2,-1,0,0,1,2,3)
fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val ia = nums.sorted()
    val res = mutableListOf<List<Int>>()
    val len = ia.size
    for (i in 0 .. (len-3))
        for (j in (len-1) downTo i+2 )
            checkFromBothSide(ia,i,j,target,res)
    return res
}
println(fourSum(a,0))
println("[[-3, -2, 2, 3], [-3, -1, 1, 3], [-3, 0, 0, 3], [-3, 0, 1, 2], [-2, -1, 0, 3], [-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]")

a = intArrayOf(-5,-4,-3,-2,-1,0,0,1,2,3,4,5)
val ex = listOf(listOf(-5,-4,4,5),listOf(-5,-3,3,5),listOf(-5,-2,2,5),listOf(-5,-2,3,4),listOf(-5,-1,1,5),listOf(-5,-1,2,4),listOf(-5,0,0,5),listOf(-5,0,1,4),listOf(-5,0,2,3),listOf(-4,-3,2,5),listOf(-4,-3,3,4),listOf(-4,-2,1,5),listOf(-4,-2,2,4),listOf(-4,-1,0,5),listOf(-4,-1,1,4),listOf(-4,-1,2,3),listOf(-4,0,0,4),listOf(-4,0,1,3),listOf(-3,-2,0,5),listOf(-3,-2,1,4),listOf(-3,-2,2,3),listOf(-3,-1,0,4),listOf(-3,-1,1,3),listOf(-3,0,0,3),listOf(-3,0,1,2),listOf(-2,-1,0,3),listOf(-2,-1,1,2),listOf(-2,0,0,2),listOf(-1,0,0,1))
ex.size
val ax = listOf(listOf(-5,-4,4,5),listOf(-5,-3,3,5),listOf(-5,-2,2,5),listOf(-5,-1,1,5),listOf(-5,0,0,5),listOf(-5,-2,3,4),listOf(-5,-1,2,4),listOf(-5,0,1,4),listOf(-4,-3,2,5),listOf(-4,-2,1,5),listOf(-4,-1,0,5),listOf(-4,-3,3,4),listOf(-4,-2,2,4),listOf(-4,-1,1,4),listOf(-4,0,0,4),listOf(-4,-1,2,3),listOf(-4,0,1,3),listOf(-3,-2,1,4),listOf(-3,-1,0,4),listOf(-3,-2,2,3),listOf(-3,-1,1,3),listOf(-3,0,0,3),listOf(-3,0,1,2),listOf(-2,-1,0,3),listOf(-2,-1,1,2),listOf(-2,0,0,2),listOf(-1,0,0,1))
ax.size
ex.subtract(ax)
val rr = fourSum(intArrayOf(-5,-4,-3,-2,-1,0,0,1,2,3,4,5),0)
rr.size
rr
a.toList()

val target = 4
val nums = intArrayOf(-5,-4,-3,-2,-1,0,0,1,2,3,4,5)
val len = nums.size
val sum2Nums: MutableMap<Int, Set<List<Int>>> = HashMap()
(0 until len - 1).flatMap { i ->
    (i + 1 until len).map { j ->
        nums[i] + nums[j] to listOf(i, j)
    }
}.groupBy({ it.first }, { it.second })
    .map { it.key to it.value.toSet() }.toMap(sum2Nums)
(0 until len - 1).flatMap { i ->
    (i + 1 until len).flatMap { j ->
        val s = target - (nums[i] + nums[j])
        sum2Nums[s]
            ?.filter { kl ->  kl[0] > j && kl[1] > j}
            ?.map { kl ->
                val lst = mutableListOf(nums[i], nums[j], nums[kl[0]], nums[kl[1]])
                lst.sort()
                lst
            }?: emptyList()
    }
}.toSet().toList().size