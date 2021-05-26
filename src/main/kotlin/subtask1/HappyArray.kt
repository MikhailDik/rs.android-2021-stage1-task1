package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.size < 3) return sadArray

        val tempList = sadArray.toMutableList()

        var i = 1
        while (true) {

            if (tempList[i] > tempList[i - 1] + tempList[i + 1]){
                tempList.removeAt(i)
                if(i > 1) i--
            }
            else {
                i++
            }
            if (i == tempList.size - 1) break
        }

        return tempList.toIntArray()

        //throw NotImplementedError("Not implemented")
    }

}


/*fun main() {

    //val sA = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3)
    //val sA = intArrayOf(0, 0, 0, 0, 0)
    val sA = intArrayOf(1, 2, 2, 9, 93, 2, 6, 9, 6, 10)
    val converter = HappyArray()

    var hA: IntArray = converter.convertToHappy(sA)

    val f = 10

}*/
