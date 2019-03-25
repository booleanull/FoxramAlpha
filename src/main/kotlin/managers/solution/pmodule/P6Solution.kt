package managers.solution.pmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Максим Нигматулин
 */

class P6Solution: BaseSolution, PModule {

    override fun makeResult(solution: Solution): String {
        return elderFactor(solution.number1)
    }

    fun elderFactor(number1: String): String {
        return ((number1.split(" ")).size - 1).toString()
    }
}