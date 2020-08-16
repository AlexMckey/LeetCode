package palindromeNumber

var i = 121
var s = i.toString()
var res: Int? = s.reversed().toInt()
i == res
i = -121
s = i.toString()
res = s.reversed().toIntOrNull()
i == res
i = 10
res = i.toString().reversed().toIntOrNull()
i == res