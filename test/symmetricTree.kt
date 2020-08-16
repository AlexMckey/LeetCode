//import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import symmetricTree.Solution
import symmetricTree.TreeNode

class SymmetricTreeTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun SymmetricTreeRecTests(e: Array<Int>, l1: TreeNode?) {
        assertEquals(e, Solution.isSymmetric(l1))
    }

    @ParameterizedTest
    @MethodSource("getData")
    fun SymmetricTreeIterTests(e: Array<Int>, l1: TreeNode?) {
        assertEquals(e, Solution.isSymmetricIter(l1))
    }
}