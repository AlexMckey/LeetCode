val ia = intArrayOf(1,3,2)
var cur = ia.lastIndex-1
cur
while (cur >= 0 && ia[cur+1] <= ia[cur]){
    cur--
}
cur
if (cur < 0) ia.sort()
else {
    var i = ia.lastIndex
    while (i > cur && ia[cur] > ia[i]){
        i--
    }
    println(i)
    val t = ia[i]
    ia[i] = ia[cur]
    ia[cur] = t
}
ia.toList()