//[17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,12]
//[17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

var a = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27)
val k = 38
var count = 0
var i = 0
var j = 0
var pos = k % a.size
//while(count < a.size) {
//    j = i
//    var num = a[j]
//    do {
//        j = (j + pos) % a.size
//        var temp = a[j]
//        a[j] = num
//        num = temp
//        count++
//    } while(j != i);
//    i++
//}
j = i
var num = a[j]
do {
    j = (j + pos) % a.size
    var temp = a[j]
    a[j] = num
    num = temp
    count++
} while(j != i);
i++
"$i: $i, j: $j, a:${a.toList()}"

j = i
num = a[j]
do {
    j = (j + pos) % a.size
    var temp = a[j]
    a[j] = num
    num = temp
    count++
} while(j != i);
i++
"$i: $i, j: $j, a:${a.toList()}"