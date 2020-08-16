var ia = intArrayOf(-1,0,1,2,-1,-4)
(0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .flatMap { j -> (j+1 until ia.size)
            .map { k -> listOf(ia[i],ia[j],ia[k]).sorted() } } }
    .filter { it.sum() == 0 }.distinct()

var m = (0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .map { j -> (ia[i] + ia[j]) to listOf(i,j)}}.toMap()
(2 until ia.size).filter { k -> m.containsKey(-ia[k]) }
    .map { ia.slice(m[-ia[it]]!! + it).sorted() }.distinct()

ia = intArrayOf(0,0,0)

(0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .flatMap { j -> (j+1 until ia.size)
            .map { k -> listOf(ia[i],ia[j],ia[k]).sorted() } } }
    .filter { it.sum() == 0 }.distinct()

m = (0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .map { j -> (ia[i] + ia[j]) to listOf(i,j)}}.toMap()
(2 until ia.size).filter { k -> m.containsKey(-ia[k]) }
    .map { ia.slice(m[-ia[it]]!! + it).sorted() }.distinct()

ia = intArrayOf(1,2,-2,-1)

m = (0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .map { j -> (ia[i] + ia[j]) to listOf(i,j)}}.toMap()
(2 until ia.size).filter { k -> m.containsKey(-ia[k]) }
    .map { ia.slice(m[-ia[it]]!! + it).sorted() }.distinct()

ia = intArrayOf(3,-2,1,0)

(0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .flatMap { j -> (j+1 until ia.size)
            .map { k -> listOf(ia[i],ia[j],ia[k]).sorted() } } }
    .filter { it.sum() == 0 }.distinct()

m = (0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .map { j -> (ia[i] + ia[j]) to listOf(i,j)}}.toMap()
m
(2 until ia.size).map { ia[it] }
(2 until ia.size).filter { k -> m.containsKey(-ia[k]) && !m[-ia[k]]!!.contains(k) }
    .map { ia.slice(m[-ia[it]]!! + it).sorted() }.distinct()

ia = intArrayOf(-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6)
//[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
m = (0..ia.size-3)
    .flatMap { i -> (i+1..ia.size-2)
        .map { j -> (ia[i] + ia[j]) to listOf(ia[i],ia[j])}}.toMap()
m
(2 until ia.size).filter { k -> m.containsKey(-ia[k])}
    .map { (m[-ia[it]]!! + ia[it]).sorted() }.distinct()