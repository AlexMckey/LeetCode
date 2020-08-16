package removeDuplicatesFromSortedArray

val ia = intArrayOf(1,1,2)
//val ia = intArrayOf(0,0,1,1,1,2,2,3,3,4)
if (ia.size == 1) ia
var idx = 0
var cur = idx+1
while (cur < ia.size-1) {
    while (cur < ia.size && ia[idx] == ia[cur])
        cur++
    idx++
    ia[idx] = ia[cur]
}
ia.toList()
idx+1