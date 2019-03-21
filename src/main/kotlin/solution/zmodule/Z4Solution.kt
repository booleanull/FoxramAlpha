package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution
import solution.nmodule.Natural

/**
@author boolenull on 21.03.2019
 */

class Z4Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (convertNaturalToWhole(Natural(solution.number1)).value).toString()
    }

    fun convertNaturalToWhole(natural: Natural): Whole {
        return Whole(natural.value)
    }
}