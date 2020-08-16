package symmetricTree

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
    // recursive
    // Accepted	188 ms	36.8 MB	kotlin
    //Runtime: 188 ms, faster than 46.75% of Kotlin online submissions for Symmetric Tree.
    //Memory Usage: 36.8 MB, less than 5.13% of Kotlin online submissions for Symmetric Tree.
    private fun isTreeSymm(p: TreeNode?, q: TreeNode?): Boolean =
        (p == null && q == null) ||
                ((p?.`val` == q?.`val`)
                        && isTreeSymm(p?.left, q?.right)
                        && isTreeSymm(p?.right, q?.left))
    fun isSymmetric(root: TreeNode?): Boolean =
        if (root == null) true
        else isTreeSymm(root.left,root.right)

    // iterative
    private fun treeToList(root: TreeNode?): List<Int> =
        if (root == null) emptyList()
        else treeToList(root.left) + root.`val` + treeToList(root.right)
    fun checkSymm(l: List<Int>): Boolean {
        val len = l.size
        for (i in 0 .. len / 2)
            if (l[i] != l[len-1-i]) return false
        return true
    }
    fun isSymmetricIter(root: TreeNode?): Boolean =
        checkSymm(treeToList(root))
}