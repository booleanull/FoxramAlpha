package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Настя Чапурина
 */

class N6Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return (mulriplyNaturalWithDigit(Natural(solution.number1), solution.digit)).value.toString()
    }

    fun mulriplyNaturalWithDigit(number1: Natural, digit: Int): Natural {
        return Natural(number1.value * digit.toBigInteger())
    }
}