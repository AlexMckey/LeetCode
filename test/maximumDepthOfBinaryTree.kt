import maximumDepthOfBinaryTree.Solution
import maximumDepthOfBinaryTree.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class MaximumDepthOfBinaryTreeTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun MaximumDepthOfBinaryTreeTests(e: Array<Int>, t: TreeNode?) {
        assertEquals(e, Solution.maxDepth(t))
    }
}