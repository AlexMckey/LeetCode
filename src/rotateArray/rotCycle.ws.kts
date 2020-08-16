var a = intArrayOf(1,2,3,4,5,6,7)
var k = 3

val newIdx = a.indices.map { (it + a.size - k) % a.size }
newIdx
a.slice(newIdx)

fun swap(a: IntArray, i: Int, j: Int) {
    val t = a[i]
    a[i] = a[j]
    a[j] = t
}

var s = a.size - k % a.size
var i = 0
var j = s
"$i: $i, j: $j, a:${a.toList()}"

while (j < a.size){
    swap(a,i,j)
    i++
    j++
}
"$i: $i, j: $j, a:${a.toList()}"

while (i < s){
    j = s
    while (j < a.size)
    {
        swap(a,i++,j++)
    }
}
"$i: $i, j: $j, a:${a.toList()}"

a = intArrayOf(3,99,-1,-100)
k = 2

s = a.size - k % a.size
i = 0
j = s
"$i: $i, j: $j, a:${a.toList()}"

while (i < s){
    j = s
    while (j < a.size)
    {
        swap(a,i++,j++)
    }
}
"$i: $i, j: $j, a:${a.toList()}"

