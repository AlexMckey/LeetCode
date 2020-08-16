import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import removeDuplicatesFromSortedList.ListNode
import removeDuplicatesFromSortedList.Solution

class RemoveDuplicatesFromSortedListTests {
    @Test
    fun RemoveDuplicatesFromSortedListTests() {
        var l: ListNode? = ListNode(1)
        var l1 = ListNode(1)
        var l2 = ListNode(2)
        var l3 = ListNode(3)
        var l4 = ListNode(3)
        l?.next = l1
        l1.next = l2
        l2.next = l3
        l3.next = l4
        assertArrayEquals(arrayOf(1,2,3), Solution.deleteDuplicates(l)?.toArray())
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