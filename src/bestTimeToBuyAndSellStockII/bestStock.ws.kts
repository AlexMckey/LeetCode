fun maxProfit_(prices: IntArray): Int {
    var m = 0
    var l = 0
    var r = prices.size-1
    while (l < r && prices[r] <= prices[r-1]){r--}
    if (l >= r) return m
    while (l < r) {
        while (l < r && prices[l] >= prices[l+1]){l++}
        if (l >= r) return m
        var i = l
        while (i < r && prices[i] <= prices[i+1]){
            i++
        }
        m += (prices[i] - prices[l])
        l = i
    }
    return m
}
fun sumProfit(prices: IntArray): Int =
    prices.toList().zipWithNext{a, b -> b - a }.filter { it > 0 }.sum()

var ia = intArrayOf(7,1,3,5,3,6,4)
maxProfit_(ia)
sumProfit(ia)

ia = intArrayOf(1,2,3,4,5)
maxProfit_(ia)
sumProfit(ia)

@OptIn(kotlin.ExperimentalStdlibApi::class)
ia.drop(1).scan(ia.first() to 0){
        acc, i -> i to (acc.second + if (i > acc.first) i - acc.first else 0)
}

ia = intArrayOf(7,6,4,3,1)
maxProfit_(ia)
sumProfit(ia)