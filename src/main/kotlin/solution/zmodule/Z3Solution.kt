package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 21.03.2019
 */

class Z3Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (mulriplyWholeWithNegative(Whole(solution.number1)).value).toString()
    }

    fun mulriplyWholeWithNegative(whole: Whole): Whole {
        return Whole(whole.value * (-1).toBigInteger())
    }
}