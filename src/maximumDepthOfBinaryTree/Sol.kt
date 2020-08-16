package maximumDepthOfBinaryTree

import kotlin.math.max

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
    // Accepted	228 ms	37.4 MB	kotlin
    //Runtime: 228 ms, faster than 34.16% of Kotlin online submissions for Maximum Depth of Binary Tree.
    //Memory Usage: 37.4 MB, less than 10.00% of Kotlin online submissions for Maximum Depth of Binary Tree.
//    fun maxDepth(root: TreeNode?): Int {
//        fun helper(root: TreeNode?, acc: Int = 0): Int =
//            if (root == null) acc
//            else max(helper(root.left, acc + 1), helper(root.right, acc + 1))
//        return helper(root)
//    }

    //more clearly
    fun maxDepth(root: TreeNode?): Int =
        if (root == null) 0
        else 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
}