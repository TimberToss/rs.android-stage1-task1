package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyList = sadArray.toCollection(ArrayList())
        var i = 1

        while (happyList.size >= 3 && i < happyList.size - 1) {

            if (happyList[i] > happyList[i - 1] + happyList[i + 1]) {
                happyList.removeAt(i)
                if (i > 1) i--
            } else {
                i++
            }
        }
        return happyList.toIntArray()
    }
}
