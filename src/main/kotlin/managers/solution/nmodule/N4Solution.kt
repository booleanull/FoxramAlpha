package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Акшин Гусейнов
 */

class N4Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return plusNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).value.toString()
    }

    fun plusNaturalWithNatural(number1: Natural, number2: Natural): Natural {
        return Natural(number1.value + number2.value)
    }
}