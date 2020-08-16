package ms

import minStack.MinStack
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertTrue

object MinStackTests {
    @Test
    fun MinStack1Tests() {
        val ex = listOf(-3,0,-2)
        val res = mutableListOf<Int>()
        val ms = MinStack()
        ms.push(-2)
        ms.push(0);
        ms.push(-3);
        res.add(ms.getMin())
        ms.pop();
        res.add(ms.top())
        res.add(ms.getMin())
        assertArrayEquals(ex.toTypedArray(),res.toTypedArray())
    }

    @Test
    fun MinStack2Tests() {
        val ex = listOf(0,0)
        val res = mutableListOf<Int>()
        val ms = MinStack()
        ms.push(0)
        ms.push(1);
        ms.push(0);
        res.add(ms.getMin())
        ms.pop();
        res.add(ms.getMin())
        assertArrayEquals(ex.toTypedArray(),res.toTypedArray())
    }
}