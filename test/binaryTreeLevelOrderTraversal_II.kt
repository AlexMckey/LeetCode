import binaryTreeLevelOrderTraversal_II.Solution
import binaryTreeLevelOrderTraversal_II.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class BinaryTreeLevelOrderTraversalTests {
    @Disabled
    @ParameterizedTest
    @MethodSource("getData")
    fun BinaryTreeLevelOrderTraversalTests(e: Array<Int>, t: TreeNode?) {
        assertEquals(e, Solution.levelOrderBottom(t))
    }
}