fun fibonacci() = sequence {
    var prevCur = 1L to 1L
    while (true) {
        yield (prevCur.first)
        prevCur = prevCur.second to prevCur.first + prevCur.second
    }
}
fibonacci().drop(6).first()
tailrec fun climb(n: Int, first: Int = 0, second: Int = 1): Int {
    return if (n == 0) second
    else climb(n-1, second, first + second)
}
climb(1)
climb(2)
climb(3)
climb(5)
