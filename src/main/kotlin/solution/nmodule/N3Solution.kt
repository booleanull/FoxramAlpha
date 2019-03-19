package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 17.03.2019
 */

class N3Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return plusNaturalWithNull(Natural(solution.number1))
    }

    fun plusNaturalWithNull(number1: Natural): String {
        return (number1.value + 1.toBigInteger()).toString()
    }
}