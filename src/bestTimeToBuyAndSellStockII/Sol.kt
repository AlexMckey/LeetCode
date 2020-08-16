package bestTimeToBuyAndSellStockII

object Solution {
    // поиск монотонно возрастающих отрезков и суммирование разниц между границами (верхней и нижней) таких отрезков
    // плюс оптимизация - пропуск монотонно убывающих отрезков
    // Accepted	224 ms	33.9 MB	kotlin
    //Runtime: 224 ms, faster than 33.33% of Kotlin online submissions for Best Time to Buy and Sell Stock II.
    //Memory Usage: 33.9 MB, less than 95.56% of Kotlin online submissions for Best Time to Buy and Sell Stock II.
    fun maxProfit(prices: IntArray): Int {
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

    // more clearly
    // если разница между двумя последовательными значения акций положительная - суммируем ее
    // 	Accepted	224 ms	37.4 MB	kotlin
    fun maxProfitClearly(prices: IntArray): Int =
        //prices.toList().zipWithNext{a, b -> b - a }.filter { it > 0 }.sum()
        prices.drop(1).fold(prices.first() to 0){
            acc, i -> i to (acc.second + if (i > acc.first) i - acc.first else 0)
        }.second
}