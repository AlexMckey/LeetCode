val s = "    Hel  lo world "
val s1 = s.trim()
s1
s1.takeLastWhile { it.isLetter() }.length