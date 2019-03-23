package managers.solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Александр Егоров
 */

class N10Solution: BaseSolution, NModule {

    @Inject
    lateinit var n1Solution: N1Solution
    @Inject
    lateinit var n7Solution: N7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return n10Function(Natural(solution.number1), Natural(solution.number2), solution.digit).value.toString()
    }

    private fun n10Function(number1: Natural, number2: Natural, digit: Int): Natural {
        return when(n1Solution.compareNaturalNumbers(number1, number2)) {
            true -> Natural((number1.value / (n7Solution.mulriplyNaturalWithTen(number2, digit).value)).toString()[0].toString())
            else -> Natural((number2.value / (n7Solution.mulriplyNaturalWithTen(number1, digit).value)).toString()[0].toString())
        }
    }
}