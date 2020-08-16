import kotlin.math.absoluteValue

val s = "PAYPALISHIRING"
val k = 4
val e3 = "PAHNAPLSIIGYIR"
val e4 = "PINALSIGYAHRPI"

s.mapIndexed { i, _ ->
    (k - 1 - i % (k * 2 - 2)).absoluteValue to i
}.groupBy({ it.first }, { it.second }).values.joinToString("") { s.slice(it) }
//.groupBy ({ it.first },{ it.second })
    //.values.map { it.joinToString("") }.joinToString("")