package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N12Solution: BaseSolution, NModule {

    @Inject
    lateinit var n1Solution: N1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return remainderNaturalWithNatural(Natural(solution.number1), Natural(solution.number2))
    }

    fun remainderNaturalWithNatural(number1: Natural, number2: Natural): String {
        return when(n1Solution.compareNaturalNumbers(number1, number2)) {
            true -> (number1.value % number2.value).toString()
            else -> (number2.value % number1.value).toString()
        }
    }
}