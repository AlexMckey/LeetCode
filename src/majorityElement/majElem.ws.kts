val ia = intArrayOf(2,2,1,1,1,2,2)
ia.groupBy { it }.maxBy { it.value.size }?.key