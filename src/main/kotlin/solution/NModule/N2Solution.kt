package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 17.03.2019
 */

class N2Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        val result = compareOnNotZero(solution.number1)
        return when(result) {
            false -> "нет"
            else -> "да"
        }
    }

    fun compareOnNotZero(number1: String): Boolean {
        return when(number1) {
            "0" -> false
            else -> true
        }
    }
}