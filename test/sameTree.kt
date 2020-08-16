//import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import sameTree.Solution
import sameTree.TreeNode

class SameTreeTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun SameTreeTests(e: Array<Int>, l1: TreeNode?, l2: TreeNode?) {
        assertEquals(e, Solution.isSameTree(l1, l2))
    }
}