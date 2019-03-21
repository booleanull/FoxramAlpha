package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 21.03.2019
 */

class Z2Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return when(compareWholeNumbers(Whole(solution.number1))) {
            true -> 2.toString()
            null -> 0.toString()
            else -> 1.toString()
        }
    }

    fun compareWholeNumbers(whole: Whole): Boolean? {
        return when {
            whole.value < 0.toBigInteger() -> false
            whole.value == 0.toBigInteger() -> null
            else -> true
        }
    }
}