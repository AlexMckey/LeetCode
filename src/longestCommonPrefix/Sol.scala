package longestCommonPrefix

object Sol {
  def longestCommonPrefix(strs: Array[String]): String =
    if (strs.isEmpty) ""
    else if (strs.length == 1) strs(0)
    else strs.reduce(calcPrefix)

  private def calcPrefix(s1: String, s2: String): String =
    s1.substring(0,s1.lazyZip(s2).takeWhile(p => p._1 == p._2).count(_ => true))
}
