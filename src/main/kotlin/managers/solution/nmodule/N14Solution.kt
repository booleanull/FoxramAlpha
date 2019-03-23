package managers.solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Акшин Гусейнов
 */

class N14Solution: BaseSolution, NModule {

    @Inject
    lateinit var n13Solution: N13Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return nokNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).value.toString()
    }

    fun nokNaturalWithNatural(number1: Natural, number2: Natural): Natural {
        return Natural((number1.value * number2.value) / n13Solution.nodNaturalWithNatural(number1, number2).value)
    }
}