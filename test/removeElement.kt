import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import removeElement.Solution
import kotlin.test.assertEquals

class RemoveElementTests {
    @ParameterizedTest
    @CsvSource("2,2;2;3;3,2,2,3",
        "0,1,3,0,4;5;2;0,1,2,2,3,0,4,2",
        ";0;3;3,3,3,3", delimiter = ';')
    fun RemoveElementTests(e: String?, ev: Int, v: Int, a: String) {
        val ia = a.split(",").map { it.toInt() }.toIntArray()
        val ex = e?.split(",")?.map { it.toInt() }?.sorted()?.toIntArray() ?: intArrayOf()
        val res = Solution.removeElement(ia, v)
        assertAll(
            Executable { assertEquals(ev, res) },
            Executable { Assertions.assertArrayEquals(ex,ia.take(res).sorted().toIntArray()) })
    }
}