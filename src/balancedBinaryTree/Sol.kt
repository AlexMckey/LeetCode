package balancedBinaryTree

import kotlin.math.abs

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
    fun isBalanced(root: TreeNode?): Boolean {
        fun depthBT(root: TreeNode?): Pair<Int,Int> =
            if (root == null) 0 to 0
            else (1+depthBT(root.left).first) to (1+depthBT(root.right).second)

        val d = depthBT(root)
        return abs(d.first-d.second) <= 1
    }
}