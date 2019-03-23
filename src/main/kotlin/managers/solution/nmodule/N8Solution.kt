package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Настя Чапурина
 */

class N8Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return mulriplyNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).value.toString()
    }

    fun mulriplyNaturalWithNatural(number1: Natural, number2: Natural): Natural {
        return Natural(number1.value * number2.value)
    }
}