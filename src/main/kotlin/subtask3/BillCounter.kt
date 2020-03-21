package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (bill.sum() - bill[k]) / 2
        return if (sum != b) {
            (b - sum).toString()
        } else "Bon Appetit"
    }
}
