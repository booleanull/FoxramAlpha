package managers.solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Акшин Гусейнов
 */

class N12Solution: BaseSolution, NModule {

    @Inject
    lateinit var n1Solution: N1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return remainderNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).value.toString()
    }

    fun remainderNaturalWithNatural(number1: Natural, number2: Natural): Natural {
        return when(n1Solution.compareNaturalNumbers(number1, number2)) {
            true -> Natural(number1.value % number2.value)
            else -> Natural(number2.value % number1.value)
        }
    }
}