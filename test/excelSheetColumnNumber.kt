import excelSheetColumnNumber.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExcelSheetColumnNumTests {
    @ParameterizedTest
    @CsvSource("1;A","2;B","26;Z","28;AB", "701;ZY", "52;AZ", "703;AAA", delimiter = ';')
    fun ExcelSheetColumnNumTest(e: Int, a: String) {
        assertEquals(e, Solution.titleToNumber(a))
    }
}