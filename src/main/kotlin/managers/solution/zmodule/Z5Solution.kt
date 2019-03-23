package managers.solution.zmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution
import managers.solution.nmodule.Natural

/**
@author Леонид Спиридонов
 */

class Z5Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (convertNaturalToWhole(Whole(solution.number1)).value).toString()
    }

    fun convertNaturalToWhole(whole: Whole): Natural {
        return Natural(whole.value)
    }
}