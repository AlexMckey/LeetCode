var a = intArrayOf(1,2,3,4,5,6,7)
var k = 3

val rotations = if (k < a.size) k else k.rem(a.size)

val copyArray = a.copyOf()

for (i in a.indices) {
    val temp = rotations + i
    val newIdx = if (temp >= a.size) temp - a.size else temp

    a[newIdx] = copyArray[i]
}
a.toList()