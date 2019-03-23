package managers.solution.zmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Леонид Спиридонов
 */

class Z3Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (mulriplyWholeWithNegative(Whole(solution.number1)).value).toString()
    }

    fun mulriplyWholeWithNegative(whole: Whole): Whole {
        return Whole(whole.value * (-1).toBigInteger())
    }
}