package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Александр Егоров
 */

class N2Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        val result = compareOnNotZero(Natural(solution.number1))
        return when(result) {
            false -> "нет"
            else -> "да"
        }
    }

    fun compareOnNotZero(number1: Natural): Boolean {
        return when(number1.value) {
            0.toBigInteger() -> false
            else -> true
        }
    }
}