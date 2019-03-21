package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution
import solution.nmodule.Natural

/**
@author boolenull on 21.03.2019
 */

class Z5Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (convertNaturalToWhole(Whole(solution.number1)).value).toString()
    }

    fun convertNaturalToWhole(whole: Whole): Natural {
        return Natural(whole.value)
    }
}