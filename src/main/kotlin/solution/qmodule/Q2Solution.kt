package solution.qmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 21.03.2019
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