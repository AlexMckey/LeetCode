//import org.junit.jupiter.params.provider.CsvSource
import mergeTwoSortedLists.ListNode
import mergeTwoSortedLists.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class MergeTwoSortedListsTests {
    @ParameterizedTest
    @MethodSource("getData")
    fun MergeTwoSortedListsTests(e: Array<Int>, l1: ListNode?, l2: ListNode?) {
        assertArrayEquals(e, Solution.mergeTwoLists(l1, l2)?.toArray())
    }
}

private fun ListNode?.toArray(): Array<Int>? {
    val l = mutableListOf<Int>()
    var p: ListNode? = this ?: return emptyArray()
    do {
        l.add(p!!.`val`)
        p = p.next
    } while (p != null)
    return l.toTypedArray()
}
