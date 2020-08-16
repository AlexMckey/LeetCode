package palindromeNumber

object Solution {
    //Accepted	256 ms	35 MB	kotlin
//    fun isPalindrome(x: Int): Boolean {
//        return x == x.toString().reversed().toIntOrNull()
//    }

    //mach faster
    //Accepted	204 ms	33.7 MB	kotlin
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var res = 0
        var i = x
        while (i != 0) {
            res = res*10 + i%10
            i /= 10
        }
        return res == x
    }
}