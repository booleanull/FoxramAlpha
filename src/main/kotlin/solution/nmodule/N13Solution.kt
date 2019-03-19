package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N13Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return nodNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).value.toString()
    }

    fun nodNaturalWithNatural(number1: Natural, number2: Natural): Natural {
        while(number2.value !== 0.toBigInteger()) {
            val tmp = number1.value % number2.value
            number1.value = number2.value
            number2.value = tmp
        }
        return number1
    }
}