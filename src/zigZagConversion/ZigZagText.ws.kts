val s = "PAYPALISHIRING"
val k = 4

s.mapIndexed { i, c -> i % (k * 2 - 2) to c }
    .groupBy ({ it.first }, {it.second})

enum class Direction {DOWN, UP}

val res = s.fold(Triple(0, Direction.DOWN, emptyList<Pair<Int,Char>>())){
    i, c ->
        val newI = i.first + if (i.second == Direction.DOWN) 1 else -1
        val newDir = when (newI) {
            0 -> Direction.DOWN
            k - 1 -> Direction.UP
            else -> i.second
        }
        Triple(newI, newDir, i.third + (i.first to c))
}.third
res

res.groupBy ({ it.first }, { it.second }).values.map { it.joinToString("") }.joinToString("")
"PINALSIGYAHRPI"
"PAHNAPLSIIGYIR"

