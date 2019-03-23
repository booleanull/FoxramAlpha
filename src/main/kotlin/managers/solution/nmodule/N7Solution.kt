package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Настя Чапурина
 */

class N7Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return mulriplyNaturalWithTen(Natural(solution.number1), solution.digit).value.toString()
    }

    fun mulriplyNaturalWithTen(number1: Natural, digit: Int): Natural {
        val stringBuilder = StringBuilder()
        for(i in 0..(digit - 1)) {
            stringBuilder.append('0')
        }

        val value = number1.value.toString() + stringBuilder.toString()

        return Natural(value)
    }
}