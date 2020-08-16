import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import addTwoNumbers.ListNode
import addTwoNumbers.Solution

class AddTwoNumbersTests {
    @Test
    fun AddTwoNumbersTests() {
        val l1 = ListNode(2)
        l1.next = ListNode(4)
        l1.next?.next = ListNode(3)
        val l2 = ListNode(5)
        l2.next = ListNode(6)
        l2.next?.next = ListNode(4)
        assertArrayEquals(arrayOf(7,0,8), Solution.addTwoNumbers(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry1Tests() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        assertArrayEquals(arrayOf(0,1), Solution.addTwoNumbers(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry2Tests() {
        val l1 = ListNode(9)
        l1.next = ListNode(8)
        val l2 = ListNode(1)
        assertArrayEquals(arrayOf(0,9), Solution.addTwoNumbers(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry3Tests() {
        val l1 = ListNode(1)
        val l2 = ListNode(9)
        l2.next = ListNode(9)
        assertArrayEquals(arrayOf(0,0,1), Solution.addTwoNumbers(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry4Tests() {
        val l1 = ListNode(9)
        l1.next = ListNode(9)
        val l2 = ListNode(9)
        assertArrayEquals(arrayOf(8,0,1), Solution.addTwoNumbers(l1,l2)?.toArray())
    }
}

class AddTwoNumbersClearlyTests {
    @Test
    fun AddTwoNumbersTests() {
        val l1 = ListNode(2)
        l1.next = ListNode(4)
        l1.next?.next = ListNode(3)
        val l2 = ListNode(5)
        l2.next = ListNode(6)
        l2.next?.next = ListNode(4)
        assertArrayEquals(arrayOf(7,0,8), Solution.addTwoNumbersClearly(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry1Tests() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        assertArrayEquals(arrayOf(0,1), Solution.addTwoNumbersClearly(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry2Tests() {
        val l1 = ListNode(9)
        l1.next = ListNode(8)
        val l2 = ListNode(1)
        assertArrayEquals(arrayOf(0,9), Solution.addTwoNumbersClearly(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry3Tests() {
        val l1 = ListNode(1)
        val l2 = ListNode(9)
        l2.next = ListNode(9)
        assertArrayEquals(arrayOf(0,0,1), Solution.addTwoNumbersClearly(l1,l2)?.toArray())
    }
    @Test
    fun AddTwoNumbersWithCarry4Tests() {
        val l1 = ListNode(9)
        l1.next = ListNode(9)
        val l2 = ListNode(9)
        assertArrayEquals(arrayOf(8,0,1), Solution.addTwoNumbersClearly(l1,l2)?.toArray())
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