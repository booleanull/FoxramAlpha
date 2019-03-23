package managers.solution.zmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution
import managers.solution.nmodule.Natural

/**
@author Леонид Спиридонов
 */

class Z4Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (convertNaturalToWhole(Natural(solution.number1)).value).toString()
    }

    fun convertNaturalToWhole(natural: Natural): Whole {
        return Whole(natural.value)
    }
}