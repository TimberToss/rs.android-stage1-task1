package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val max = input.max() ?: 0
        val min = input.min() ?: 0
        val sum = input.sum()
        return arrayOf(sum - max, sum - min).toIntArray()
    }
}
