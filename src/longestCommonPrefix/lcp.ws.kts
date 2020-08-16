package longestCommonPrefix

//val starr = arrayOf("c","acc","ccc")
val starr = arrayListOf("flower","flow","flight")

var i = 0
val fw = starr[0]
val tl = starr.drop(1)
tl.all { it[i] == fw[i] }
i++
tl.all { it[i] == fw[i] }
i++
tl.all { it[i] == fw[i] }
val minst = starr.minBy { it.length }!!
minst

val sl = minst.indices.map{i -> i to starr.all{it[i] == minst[i]}}
    .filter { it.second }.map { minst[it.first] }.joinToString("")
sl
//minst.slice(sl)

starr.sort()
starr.first().zip(starr.last())
    .takeWhile { p -> p.first == p.second }
    .map { it.first }.joinToString("")