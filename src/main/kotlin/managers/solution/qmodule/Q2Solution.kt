package managers.solution.qmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Леонид Никулин
 */

class Q2Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return when(isWhole(solution.number1)) {
            true -> "да"
            else -> "нет"
        }
    }

    fun isWhole(frac: String): Boolean {
        return !frac.contains("/")
    }
}