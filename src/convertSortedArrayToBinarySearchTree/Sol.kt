package convertSortedArrayToBinarySearchTree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object Solution {
    private fun conv(ia: IntArray, d: Int, u: Int): TreeNode? {
        return when (u - d + 1) {
            3 -> {
                val res = TreeNode(ia[d])
                val res1 = TreeNode(ia[d-1])
                val res2 = TreeNode(ia[d+1])
                res.left = res1
                res.right = res2
                res }
            2 -> {
                val res = TreeNode(ia[d])
                val res1 = TreeNode(ia[d-1])
                res.left = res1
                res
            }
            1 -> TreeNode(ia[d-1])
            0 -> null
            else -> {
                val m = (d + u) / 2
                val res = TreeNode(ia[m-1])
                res.left = conv(ia, d,m-1)
                res.right = conv(ia, m+1,u)
                res
            }
        }
    }

    // Accepted	204 ms	35.8 MB	kotlin
    //Runtime: 204 ms, faster than 60.27% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.
    //Memory Usage: 35.8 MB, less than 84.21% of Kotlin online submissions for Convert Sorted Array to Binary Search Tree.
    fun sortedArrayToBST(nums: IntArray): TreeNode? =
        conv(nums,1, nums.size)

    // more clearly
    fun sortedArrayToBSTClear(nums: IntArray): TreeNode? =
        if (nums.isEmpty()) null
        else makeTree(nums, 0, nums.size - 1)

    private fun makeTree(nums: IntArray, i: Int, j: Int) : TreeNode? {
        val m = ((j - i) / 2) + i
        val node = TreeNode(nums[m])
        if ((m - 1) - i >= 0) node.left = makeTree(nums, i, m - 1)
        if (j - (m + 1) >= 0) node.right = makeTree(nums, m + 1, j)
        return node
    }
}