package sameTree

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
    // Accepted	188 ms	32.3 MB	kotlin
    //Runtime: 188 ms, faster than 61.84% of Kotlin online submissions for Same Tree.
    //Memory Usage: 32.3 MB, less than 44.00% of Kotlin online submissions for Same Tree.
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
        (p == null && q == null)||
        ((p?.`val` == q?.`val`) &&
          isSameTree(p?.left, q?.left) &&
          isSameTree(p?.right, q?.right))
}