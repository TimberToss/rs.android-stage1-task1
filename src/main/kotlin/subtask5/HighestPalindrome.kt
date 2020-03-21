package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val firstHalf = StringBuilder(digitString.substring(0, n / 2))
        val secondHalf = StringBuilder(digitString.substring(n - n / 2).reversed())
        val result = StringBuilder()

        var quantityOfMismatches = 0

        for (i in firstHalf.indices) {
            if (firstHalf[i] != secondHalf[i]) {
                quantityOfMismatches++
            }
        }

        var quantityOfChanges = k

        if (quantityOfChanges >= quantityOfMismatches) {

            quantityOfChanges -= quantityOfMismatches

            for (i in firstHalf.indices) {
                var value = if (firstHalf[i] > secondHalf[i]) {
                    firstHalf[i]
                } else {
                    secondHalf[i]
                }

                if (firstHalf[i] != '9' && secondHalf[i] != '9' && quantityOfChanges > 0) {

                    if (firstHalf[i] == secondHalf[i]) {
                        if (quantityOfChanges >= 2) {
                            value = '9'
                            quantityOfChanges -= 2
                        }
                    } else {
                        value = '9'
                        quantityOfChanges--
                    }
                }
                result.append(value)
            }

            val beginOfResult = StringBuilder(result)

            if (n % 2 == 1) {
                if (quantityOfChanges != 0) {
                    beginOfResult.append("9")
                }
                else {
                    beginOfResult.append(digitString[n / 2])
                }
            }
            return beginOfResult.append(result.reverse()).toString()
        } else {
            return "-1"
        }
    }
}