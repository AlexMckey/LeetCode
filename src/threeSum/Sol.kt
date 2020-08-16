package threeSum

object Solution {
    // Accepted	1576 ms	55.2 MB	kotlin
    //Runtime: 1576 ms, faster than 32.66% of Kotlin online submissions for 3Sum.
    //Memory Usage: 55.2 MB, less than 5.26% of Kotlin online submissions for 3Sum.
    fun threeSum(nums: IntArray): List<List<Int>> {
        val ia = nums.sorted()
        val res = hashSetOf<List<Int>>()
        val len = ia.size
        for (i in 0 .. len - 3) {
            var l = i + 1
            var r = len - 1
            while (l < r) {
                val list = listOf(ia[i], ia[l], ia[r])
                when {
                    list.sum() == 0 -> {
                        res.add(list.sorted())
                        l++
                        r--
                    }
                    list.sum() < 0 -> l++
                    else -> r--
                }

            }
        }
        return res.toList()
    }

    // Возможности для улучшения:
    // Одно из чисел всегда должно быть меньше 0, либо равно 0 (если все нули)
    // - цикл для первого числа можно сделать только по отрицательным числам
    // Для того, чтобы не сортировать найденные массивы
    // - для поиска суммы только для уникальных чисел.
    // И с учетом того что массив отсортирован,
    // можно при поиске 2-го и 3-го числа пропускать числа,
    // которые уже были на предыдущем шаге.
    // Accepted	680 ms	46.9 MB	kotlin
    //Runtime: 680 ms, faster than 81.29% of Kotlin online submissions for 3Sum.
    //Memory Usage: 46.9 MB, less than 42.10% of Kotlin online submissions for 3Sum.
    fun threeSumOptimized(nums: IntArray): List<List<Int>> {
        val ia = nums.sorted()
        val res = hashSetOf<List<Int>>()
        val len = ia.size
        var i = 0
        while (i < len-2 && ia[i] <= 0) {
            var l = i + 1
            var r = len - 1
            while (l < r) {
                val sum = ia[i] + ia[l] + ia[r]
                if (sum < 0 || l > i + 1 && ia[l] == ia[l - 1])
                    ++l
                else if (sum > 0 || r < len - 1 && ia[r] == ia[r + 1])
                    --r
                else
                    res.add(listOf(ia[i], ia[l++], ia[r--]))
            }
            i++
        }
        return res.toList()
    }
}