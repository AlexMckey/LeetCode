package twoSum

val target = 9
val arr = arrayOf(2, 7, 11, 15).asSequence()
val res = arr.mapIndexed { i, x -> x to i }
    .zipWithNext()
    .takeWhile { tp -> tp.first.first + tp.second.first <= target }
    .last()
    .let { tp -> arrayOf(tp.first.second, tp.second.second) }
res.toList()

val cart = arr.mapIndexed{i,x -> x to i}
    .flatMap { f ->
        arr.mapIndexed{i,x -> (x + f.first) to (f.second to i)}}
    .filterNot { tp -> tp.second.first == tp.second.second }
cart.first { tp -> tp.first == target }
    .let { tp -> arrayOf(tp.second.first, tp.second.second) }.toList()
