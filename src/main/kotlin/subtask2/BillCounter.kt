package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var sum: Int = bill.sum()
        sum -= bill[k]
        val price: Int = sum / 2

        return if (price == b) "Bon Appetit"
        else (b - price).toString()

        //throw NotImplementedError("Not implemented")
    }
}
