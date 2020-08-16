import balancedBinaryTree.Solution
import balancedBinaryTree.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class BalancedBinaryTreeTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun BalancedBinaryTreeTests(e: Boolean, tn: TreeNode?) {
        assertEquals(e, Solution.isBalanced(tn))
    }
}