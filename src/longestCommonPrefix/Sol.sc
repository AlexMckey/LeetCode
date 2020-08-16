def calcPrefix(s1: String, s2: String): String =
  s1.lazyZip(s2).takeWhile { p => p._1 == p._2 }.map(_._1).mkString

def longestCommonPrefix(strs: Array[String]): String =
  if (strs.isEmpty) ""
  else if (strs.length == 1) strs(0)
  else strs.reduce(calcPrefix)

val a1 = Array("flower","flow","flight")
longestCommonPrefix(a1)
val s1 = a1(0)
val s2 = a1(1)
val s3 = a1(2)
val r1 = s1.substring(0,s1.zip(s2).takeWhile(p => p._1 == p._2).count(_ => true))
val r2 = r1.substring(0,r1.zip(s3).takeWhile(p => p._1 == p._2).count(_ => true))

