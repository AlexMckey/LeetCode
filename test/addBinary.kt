import addBinary.Solution
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class AddBinaryTests {
    @ParameterizedTest
    @CsvSource("100;11;1","10101;1010;1011", delimiter = ';')
    fun AddBinaryTests(e: String, a: String, b: String) {
        assertEquals(e, Solution.addBinary(a, b))
    }
}