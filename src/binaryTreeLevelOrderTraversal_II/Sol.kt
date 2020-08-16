package binaryTreeLevelOrderTraversal_II

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
    // Accepted	220 ms	35.6 MB	kotlin
    //Runtime: 220 ms, faster than 67.01% of Kotlin online submissions for Binary Tree Level Order Traversal II.
    //Memory Usage: 35.6 MB, less than 16.67% of Kotlin online submissions for Binary Tree Level Order Traversal II.
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        fun treeToList(
            root: TreeNode?,
            lvl: Int = 0
        ): List<Pair<Int,Int>> =
            if (root == null) emptyList()
            else treeToList(root.left, lvl+1) +
                 (root.`val` to lvl) +
                 treeToList(root.right, lvl+1)

        return treeToList(root)
            .groupBy({it.second},{it.first})
            .toSortedMap().values.reversed()
    }
}