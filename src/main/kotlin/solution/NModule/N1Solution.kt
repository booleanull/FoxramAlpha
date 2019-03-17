package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 17.03.2019
 */

class N1Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        val result = compareNaturalNumbers(solution.number1, solution.number2)
        return when(result) {
            null -> "0"
            false -> "1"
            else -> "2"
        }
    }

    fun compareNaturalNumbers(number1: String, number2: String): Boolean? {
        when {
            number1.length > number2.length -> return true
            number1.length < number2.length -> return false
            else -> {
                for(i in number1.length - 1 downTo 0) {
                    if(number1[i].toInt() > number2[i].toInt()) {
                        return true
                    } else if(number1[i].toInt() < number2[i].toInt()) {
                        return false
                    }
                }
                return null
            }
        }
    }
}