package reverseInteger

object Solution {
    //Accepted	172 ms	34 MB	kotlin
//    fun reverse(x: Int): Int =
//        try { x.absoluteValue.toString().reversed().toInt()*x.sign }
//        catch (e: NumberFormatException) { 0 }

    //mach faster
    //Accepted	144 ms	32.2 MB	kotlin
    fun reverse(x: Int): Int {
        var res = 0L
        var i = x
        while (i != 0){
            res = res * 10 + i%10
            i /= 10
        }
        return if (res > Int.MAX_VALUE || res < Int.MIN_VALUE) 0
        else res.toInt()
    }
}