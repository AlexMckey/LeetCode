import intersectionOfTwoLinkedLists.ListNode
import intersectionOfTwoLinkedLists.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object IntersectionOfTwoLinkedTests {
    @Test
    fun IntersectionOfTwoLinked1Tests() {
        val l1 = ListNode(4)
        val l2 = ListNode(1)
        val l3 = ListNode(5)
        val l4 = ListNode(6)
        val l5 = ListNode(1)
        val l6 = ListNode(8)
        val l7 = ListNode(4)
        val l8 = ListNode(5)
        l1.next = l2
        l2.next = l6
        l3.next = l4
        l4.next = l5
        l5.next = l6
        l6.next = l7
        l7.next = l8
        assertEquals(l6, Solution.getIntersectionNode(l1, l3))
    }

    @Test
    fun IntersectionOfTwoLinked2Tests() {
        val l1 = ListNode(1)
        val l2 = ListNode(9)
        val l3 = ListNode(1)
        val l4 = ListNode(3)
        val l5 = ListNode(2)
        val l6 = ListNode(4)
        l1.next = l2
        l2.next = l3
        l3.next = l5
        l5.next = l6
        l4.next = l5
        assertEquals(l5, Solution.getIntersectionNode(l1, l4))
    }

    @Test
    fun IntersectionOfTwoLinked3Tests() {
        val l1 = ListNode(1)
        val l2 = ListNode(9)
        val l3 = ListNode(1)
        val l4 = ListNode(3)
        val l5 = ListNode(2)
        l1.next = l2
        l2.next = l3
        l4.next = l5
        assertEquals(null, Solution.getIntersectionNode(l1, l4))
    }
}