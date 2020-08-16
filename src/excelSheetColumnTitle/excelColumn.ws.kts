val n = 27
('A'+n/26-1).toString()+('A'+n%26-1).toChar()
tailrec fun toLetter(n: Int, acc: String = ""): String =
    if (n == 0) acc
    else toLetter((n - 1) / 26, 'A' + (n - 1) % 26 + acc)
toLetter(1)
toLetter(2)
toLetter(26)
toLetter(27)
toLetter(701)
toLetter(52)
toLetter(703)