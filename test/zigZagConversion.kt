import zigZagConversion.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ZigZagConversionTests {
    @ParameterizedTest
    @CsvSource("PAHNAPLSIIGYIR;PAYPALISHIRING;3","PINALSIGYAHRPI;PAYPALISHIRING;4", "A;A;1", delimiter = ';')
    fun  ZigZagConversionTests(e: String?, v: String, n: Int) {
        assertEquals(e?:"", Solution.convert(v,n))
    }

//    @ParameterizedTest
//    @CsvSource("fl;flower,flow,flight",";dog,racecar,car",";c,acc,ccc", delimiter = ';')
//    fun ЯigZagConversionTests(e: String?, v: String) {
//        assertEquals(e?:"", Solution.builtinLongestCommonPrefix(v.split(',').toTypedArray()))
//    }
}