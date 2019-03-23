package managers.solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Виталий Зуб
 */

class N9Solution: BaseSolution, NModule {

    @Inject
    lateinit var n1Solution: N1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return minusNaturalWithNaturalOnDigit(Natural(solution.number1), Natural(solution.number2), solution.digit).value.toString()
    }

    fun minusNaturalWithNaturalOnDigit(number1: Natural, number2: Natural, digit: Int): Natural {
        return when(n1Solution.compareNaturalNumbers(number1, number2)) {
            true -> Natural(number1.value - (digit.toBigInteger() * number2.value))
            else -> Natural(number2.value - (digit.toBigInteger() * number1.value))
        }
    }
}