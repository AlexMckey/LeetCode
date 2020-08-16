import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import swapNodesInPairs.ListNode
import swapNodesInPairs.Solution
import kotlin.test.assertNull

class SwapNodesInPairsTests {
    @Test
    fun SwapNodesInPairs1Tests() {
        // remove inner element
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        assertArrayEquals(arrayOf(2,1,4,3), Solution.swapPairs(l1)?.toArray())
    }

    @Test
    fun SwapNodesInPairs2Tests() {
        // remove first element
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        val l5 = ListNode(5)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5
        assertArrayEquals(arrayOf(2,1,4,3,5), Solution.swapPairs(l1)?.toArray())
    }

    @Test
    fun SwapNodesInPairs3Tests() {
        //remove lastelement
        val l1: ListNode? = ListNode(1)
        assertArrayEquals(arrayOf(1), Solution.swapPairs(l1)?.toArray())
    }

    @Test
    fun SwapNodesInPairs4Tests() {
        //empty listNode = null
        assertNull(Solution.swapPairs(null))
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
