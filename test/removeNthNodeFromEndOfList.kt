import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import removeNthNodeFromEndOfList.ListNode
import removeNthNodeFromEndOfList.Solution

class RemoveNthNodeFromEndOfListTests {
    @Test
    fun RemoveNthNodeFromEndOfList1Tests() {
        // remove inner element
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        val l5 = ListNode(5)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5
        assertArrayEquals(arrayOf(1,2,3,5), Solution.removeNthFromEnd(l1,2)?.toArray())
    }

    @Test
    fun RemoveNthNodeFromEndOfList2Tests() {
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
        assertArrayEquals(arrayOf(2,3,4,5), Solution.removeNthFromEnd(l1,5)?.toArray())
    }

    @Test
    fun RemoveNthNodeFromEndOfList3Tests() {
        //remove lastelement
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        val l5 = ListNode(5)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5
        assertArrayEquals(arrayOf(1,2,3,4), Solution.removeNthFromEnd(l1,1)?.toArray())
    }
}

class RemoveNthNodeFromEndOfListCorrectTests {
    @Test
    fun RemoveNthNodeFromEndOfList1Tests() {
        // remove inner element
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        val l5 = ListNode(5)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5
        assertArrayEquals(arrayOf(1,2,3,5), Solution.removeNthFromEndCorrect(l1,2)?.toArray())
    }

    @Test
    fun RemoveNthNodeFromEndOfList2Tests() {
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
        assertArrayEquals(arrayOf(2,3,4,5), Solution.removeNthFromEndCorrect(l1,5)?.toArray())
    }

    @Test
    fun RemoveNthNodeFromEndOfList3Tests() {
        //remove lastelement
        val l1: ListNode? = ListNode(1)
        val l2 = ListNode(2)
        val l3 = ListNode(3)
        val l4 = ListNode(4)
        val l5 = ListNode(5)
        l1?.next = l2
        l2.next = l3
        l3.next = l4
        l4.next = l5
        assertArrayEquals(arrayOf(1,2,3,4), Solution.removeNthFromEndCorrect(l1,1)?.toArray())
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