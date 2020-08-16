//[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
var nums = intArrayOf(-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6)
var ia = nums.sorted()
var res = hashSetOf<List<Int>>()
val len = ia.size
for (i in 0 .. len - 3) {
    var l = i + 1
    var r = len - 1
    while (l < r) {
        val list = listOf(ia[i], ia[l], ia[r])
        when {
            list.sum() == 0 -> {
                res.add(list.sorted())
                l++
                r--
            }
            list.sum() < 0 -> l++
            else -> r--
        }

    }
}
res.toList()

fun threeSumOptimized(nums: IntArray): List<List<Int>> {
    val ia = nums.sorted()
    val res = hashSetOf<List<Int>>()
    val len = ia.size
    var i = 0
    while (i < len-2 && ia[i] <= 0) {
        var l = i + 1
        var r = len - 1
        while (l < r) {
            val sum = ia[i] + ia[l] + ia[r]
            if (sum < 0 || l > i + 1 && ia[l] == ia[l - 1])
                ++l
            else if (sum > 0 || r < len - 1 && ia[r] == ia[r + 1])
                --r
            else
                res.add(listOf(ia[i], ia[l++], ia[r--]))
        }
        i++
    }
    return res.toList()
}

threeSumOptimized(nums)