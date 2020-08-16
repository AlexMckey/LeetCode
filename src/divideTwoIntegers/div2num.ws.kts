import kotlin.math.absoluteValue
import kotlin.math.sign

val a = -7
val b = 3
val s = a.sign * b.sign
s
var dividend = a.absoluteValue
val divisor = b.absoluteValue
var cnt = 0
var diff = dividend - divisor
while (diff > 0){
    cnt++
    diff -= divisor
}
cnt * s