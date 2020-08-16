val a = "FXSHRXW"
val b = "A"
val c = "ZY"
b.map { it - 'A' + 1 }.
        reduce { acc, i -> acc * 26 + i }

c.map { it - 'A' + 1 }.
reduce { acc, i -> acc * 26 + i }
a.map { it - 'A' + 1 }.
reduce { acc, i -> acc * 26 + i }