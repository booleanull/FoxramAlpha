package managers.solution.pmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author boolenull on 25.03.2019
 */

class P5Solution: BaseSolution, PModule {

    override fun makeResult(solution: Solution): String {
        return elderFactor(solution.number1)
    }

    fun elderFactor(number1: String): String {
        return (number1.split(" ")[0])
    }
}