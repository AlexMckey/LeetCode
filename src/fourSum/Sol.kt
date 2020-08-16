package fourSum

import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.listOf
import kotlin.collections.mutableListOf
import kotlin.collections.slice
import kotlin.collections.sorted
import kotlin.collections.sum


object Solution {
    // Accepted	760 ms	57.6 MB	kotlin
    //Runtime: 760 ms, faster than 28.57% of Kotlin online submissions for 4Sum.
    //Memory Usage: 57.6 MB, less than 25.00% of Kotlin online submissions for 4Sum.
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        fun checkFromBothSide(sa: List<Int>, i: Int, j: Int, t: Int, res: MutableList<List<Int>>) {
            var l = i + 1
            var r = j - 1
            while (l < r) {
                val idxs = listOf(i, l, r, j)
                val list = sa.slice(idxs)
                val sum = list.sum()
                println("is:$idxs l:$list s:$sum")
                if (sum < t || l > i + 1 && sa[l] == sa[l - 1])
                    ++l
                else if (sum > t || r < j - 1 && sa[r] == sa[r + 1])
                    --r
                else {
                    res.add(list)
                    ++l
                    --r
                }
            }
        }
        val ia = nums.sorted()
        val res = mutableListOf<List<Int>>()
        val len = ia.size
        for (i in 0 .. (len-3)) {
            if (i > 0 && ia[i] == ia[i - 1]) continue
            for (j in (len - 1) downTo i + 1) {
                if (j < len-1 && ia[j] == ia[j + 1]) continue
                checkFromBothSide(ia, i, j, target, res)
            }
        }
        return res
    }

    // faster
    // Accepted	356 ms	45.2 MB	kotlin
    //Runtime: 356 ms, faster than 59.26% of Kotlin online submissions for 4Sum.
    //Memory Usage: 45.2 MB, less than 33.33% of Kotlin online submissions for 4Sum.
    fun fourSumFaster(nums: IntArray, target: Int): List<List<Int>> {
        val res: MutableSet<List<Int>> = HashSet()
        val len = nums.size
        val sum2Nums: MutableMap<Int, MutableSet<List<Int>>> = HashMap()
        for (i in 0 until len - 1) {
            for (j in i + 1 until len) {
                sum2Nums.computeIfAbsent(
                    nums[i] + nums[j]
                ) { HashSet() }.add(listOf(i, j))
            }
        }
        for (i in 0 until len - 1) {
            for (j in i + 1 until len) {
                val s = target - (nums[i] + nums[j])
                if (sum2Nums.containsKey(s)) {
                    for (kl in sum2Nums[s]!!) {
                        if (kl[0] > j && kl[1] > j) {
                            // even with this index arranging, the quardruplet of [i,j,k,l] is never dup, but
                            // [nums[i], nums[j], nums[k], nums[l]] may still be dup when those 4 nums are
                            // not all different from each other, so use Set<List<Integer>> for res.
                            // Further more, the quardruplet need to follow certain order for the set to
                            // differentiate them, hence need sorting. This sort on 4 elements may not be i big deal
                            val quard = mutableListOf(nums[i], nums[j], nums[kl[0]], nums[kl[1]])
                            quard.sort()
                            res.add(quard)
                        }
                    }
                }
            }
        }
        return res.toList()
    }

    // use BinarySearch
    // Accepted	472 ms	40.5 MB	kotlin
    //Runtime: 472 ms, faster than 48.15% of Kotlin online submissions for 4Sum.
    //Memory Usage: 40.5 MB, less than 33.33% of Kotlin online submissions for 4Sum.
    fun fourSumBS(nums: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        nums.sort()
        val len = nums.size
        val last2Sum = nums.takeLast(2).sum()
        val last3Sum = nums.takeLast(3).sum()
        for (i in 0 until len - 3) {
            if (nums[i] + last3Sum < target) continue
            if (nums.slice(i..i+3).sum() > target) break
            if (i > 0 && nums[i] == nums[i - 1]) continue
            for (j in (i + 1) until (len - 2)) {
                val sum2 = nums[i] + nums[j]
                if (sum2 + last2Sum < target) continue
                if (sum2 + nums[j + 1] + nums[j + 2] > target) break
                if (j > i + 1 && nums[j] == nums[j - 1]) continue
                var r = len - 1
                for (k in (j + 1) until r) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue
                    val sum3 = sum2 + nums[k]
                    var l = k + 1
                    while (l <= r) {
                        val d = (l + r) shr 1 //half
                        if (sum3 + nums[d] < target) {
                            l = d + 1
                        } else if (sum3 + nums[d] > target) {
                            r = d - 1
                        } else {
                            res.add(nums.slice(listOf(i,j,k,d)))
                            r = d - 1
                            break
                        }
                    }
                }
            }
        }
        return res
    }
}