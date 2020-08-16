import linkedListCycle.ListNode
import linkedListCycle.Solution
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

object LinkedListCycleTests {
    @Test
    fun LinkedListCycle1Tests() {
        val l: ListNode? = ListNode(3)
        val l1 = ListNode(2)
        val l2 = ListNode(0)
        val l3 = ListNode(-4)
        l?.next = l1
        l1.next = l2
        l2.next = l3
        l3.next = l1
        assertTrue { Solution.hasCycle(l) }
    }

    @Test
    fun LinkedListCycle2Tests() {
        val l: ListNode? = ListNode(3)
        val l1 = ListNode(2)
        l?.next = l1
        l1.next = l
        assertTrue { Solution.hasCycle(l) }
    }

    @Test
    fun LinkedListCycle3Tests() {
        val l: ListNode? = ListNode(1)
        assertFalse { Solution.hasCycle(l) }
    }

    @Test
    fun LinkedListCycle4Tests() {
        val l: ListNode? = ListNode(3)
        val l1 = ListNode(2)
        l?.next = l1
        assertFalse { Solution.hasCycle(l) }
    }
}