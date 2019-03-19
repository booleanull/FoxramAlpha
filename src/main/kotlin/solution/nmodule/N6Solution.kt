package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N6Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return mulriplyNaturalWithDigit(Natural(solution.number1), solution.digit)
    }

    fun mulriplyNaturalWithDigit(number1: Natural, digit: Int): String {
        return (number1.value * digit.toBigInteger()).toString()
    }
}