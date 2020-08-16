fun <T> getCartesianProduct(args: Collection<Iterable<T>>): Set<List<T>> =
    if (args.isEmpty()) emptySet()
    else args.drop(1).fold(args.first().map(::listOf)) { acc, iterable ->
        acc.flatMap { list -> iterable.map(list::plus) }
    }.toSet()

fun cartesianProduct2String(s1: List<String>, s2: String): List<String> =
    if (s1.isNullOrEmpty()) s2.map { it.toString() }
    else s1.flatMap { a -> s2.map { b -> "$a$b" } }

fun cartesianProductForReduce(s1: List<String>, s2: List<String>): List<String> =
    if (s1.isNullOrEmpty()) s1
    else s1.flatMap { a -> s2.map { b -> "$a$b" } }

fun cartesianProductString(l: List<String>): List<String> =
    l.fold(emptyList()) {acc, s -> cartesianProduct2String(acc,s) }

val phoneKeys = mapOf(
    '1' to "".map(Char::toString),
    '2' to "abc".map(Char::toString),
    '3' to "def".map(Char::toString),
    '4' to "ghi".map(Char::toString),
    '5' to "jkl".map(Char::toString),
    '6' to "mno".map(Char::toString),
    '7' to "pqrs".map(Char::toString),
    '8' to "tuv".map(Char::toString),
    '9' to "wxyz".map(Char::toString),
    '0' to " ".map(Char::toString)
)

getCartesianProduct("23".map { phoneKeys[it]!!.asIterable() })

val s1 = phoneKeys['2']!!
val s2 = phoneKeys['3']!!
s1.flatMap { a -> s2.map { b -> "$a$b" } }

val l1 = cartesianProduct2String(emptyList(),"abc")
l1
val l2 = cartesianProduct2String(l1,"def")
l2
val l3 = cartesianProduct2String(l2,"ghi")
l3

val ll1 = cartesianProductForReduce(phoneKeys['2']!!,phoneKeys['3']!!)
ll1
val ll2 = cartesianProductForReduce(ll1,phoneKeys['4']!!)
ll2

("545350".map { phoneKeys[it]!!}).reduce{
    acc, list ->  cartesianProductForReduce(acc, list)
}