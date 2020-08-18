import java.util.*

val sm = sortedMapOf<Int,Int>()
sm.put(-3,sm.size+1)
sm
sm.put(-2,sm.size+1)
sm
sm.firstKey()
sm.maxByOrNull { it.value }

val pq = PriorityQueue<Int>()
pq.add(-2)
pq.add(0)
pq.add(-3)
pq
pq.minOrNull()
pq.peek()
pq.remove(pq.size-1)
pq.minOrNull()
pq.peek()

val s = mutableListOf<Int>()
s.add(0,-2)
s.add(0,0)
s.add(0,-3)
s
s.minOrNull()
s.removeAt(0)
s.first()
s.minOrNull()

