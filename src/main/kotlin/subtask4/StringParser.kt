package subtask4

import java.lang.StringBuilder

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val brackets = listOf('<', '(', '[', '>', ')', ']')
        val result = ArrayList<String>()
        val stringBuilder = StringBuilder(inputString)

        for (i in stringBuilder.length - 1 downTo 0) {
            if (stringBuilder[i] in brackets.subList(0, 3)) {

                var lastIndex = 0
                for (index in i until stringBuilder.length) {
                    if (stringBuilder[index] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                        lastIndex = index
                        stringBuilder[i] = '_'
                        stringBuilder[lastIndex] = '_'
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, lastIndex))
            }
        }
        return result.toTypedArray()
    }
}
