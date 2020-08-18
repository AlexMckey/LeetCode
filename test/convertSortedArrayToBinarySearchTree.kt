import convertSortedArrayToBinarySearchTree.Solution
import convertSortedArrayToBinarySearchTree.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

@Disabled
class ConvertSortedArrayToBinarySearchTreeTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun ConvertSortedArrayToBinarySearchTreeTests(et: TreeNode?, ia: IntArray) {
        assertEquals(et, Solution.sortedArrayToBST(ia))
    }

    @ParameterizedTest
    @MethodSource("getData")
    fun ConvertSortedArrayToBinarySearchTreeClearTests(et: TreeNode?, ia: IntArray) {
        assertEquals(et, Solution.sortedArrayToBSTClear(ia))
    }
}