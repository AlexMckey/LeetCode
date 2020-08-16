var s = "A man, a plan, a canal: Panama"
var cs = s.toLowerCase().filter { it.isLetter() }
var l = 0
var r = cs.length-1
while (l < r && cs[l] == cs[r]) {l++;r--}
"l: $l, r: $r"
l >= r

s = "race a car"
cs = s.toLowerCase().filter { it.isLetter() }
l = 0
r = cs.length-1
while (l < r && cs[l] == cs[r]) {l++;r--}
"l: $l, r: $r"
l >= r

s = "race car"
cs = s.toLowerCase().filter { it.isLetter() }
l = 0
r = cs.length-1
while (l < r && cs[l] == cs[r]) {l++;r--}
"l: $l, r: $r"
l >= r

s = "aa"
cs = s.toLowerCase().filter { it.isLetter() }
l = 0
r = cs.length-1
while (l < r && cs[l] == cs[r]) {l++;r--}
"l: $l, r: $r"
l >= r