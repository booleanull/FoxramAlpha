package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N8Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return mulriplyNaturalWithNatural(Natural(solution.number1), Natural(solution.number2))
    }

    fun mulriplyNaturalWithNatural(number1: Natural, number2: Natural): String {
        return (number1.value * number2.value).toString()
    }
}