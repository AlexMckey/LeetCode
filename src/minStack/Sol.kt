package minStack

// Accepted	700 ms	53.8 MB	kotlin
//Runtime: 700 ms, faster than 16.50% of Kotlin online submissions for Min Stack.
//Memory Usage: 53.8 MB, less than 20.69% of Kotlin online submissions for Min Stack.
//class MinStack() {
//    private val sm = mutableListOf<Int>()
//
//    fun push(x: Int) {
//        sm.add(0,x)
//    }
//
//    fun pop() {
//        sm.removeAt(0)
//    }
//
//    fun top(): Int {
//        return sm.first()
//    }
//
//    fun getMin(): Int {
//        return sm.min()!!
//    }
//
//}

//  more faster - no need min()
//  Accepted	236 ms	38.6 MB	kotlin
//Runtime: 236 ms, faster than 69.90% of Kotlin online submissions for Min Stack.
//Memory Usage: 38.6 MB, less than 41.38% of Kotlin online submissions for Min Stack.
class MinStack() {
    private val sm = mutableListOf<Pair<Int,Int>>()

    fun push(x: Int) {
        sm.add(0,x to minOf(x,sm.firstOrNull()?.second?:Int.MAX_VALUE))
    }

    fun pop() {
        sm.removeAt(0)
    }

    fun top(): Int {
        return sm.first().first
    }

    fun getMin(): Int {
        return sm.first().second
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */