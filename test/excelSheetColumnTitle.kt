import excelSheetColumnTitle.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExcelSheetColumnTitleTests {
    @ParameterizedTest
    @CsvSource("A;1","B;2","Z;26","AB;28", "ZY;701", "AZ;52", "AAA;703", delimiter = ';')
    fun ExcelSheetColumnTitleTest(e: String, x: Int) {
        assertEquals(e, Solution.convertToTitle(x))
    }
}