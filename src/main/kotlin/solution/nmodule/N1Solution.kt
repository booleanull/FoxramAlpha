package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author Настя Чапурина on 17.03.2019
 */

class N1Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        val result = compareNaturalNumbers(Natural(solution.number1), Natural(solution.number2))
        return when(result) {
            null -> "0"
            false -> "1"
            else -> "2"
        }
    }

    fun compareNaturalNumbers(number1: Natural, number2: Natural): Boolean? {
        return when {
            number1.value > number2.value -> true
            number1.value < number2.value -> false
            else -> null
        }
    }
}