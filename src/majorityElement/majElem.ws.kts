val ia = intArrayOf(2,2,1,1,1,2,2)
ia.groupBy { it }.maxByOrNull { it.value.size }?.key