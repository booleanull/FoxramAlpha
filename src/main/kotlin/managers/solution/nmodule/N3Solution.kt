package managers.solution.nmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Александр Егоров
 */

class N3Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return (plusNaturalWithNull(Natural(solution.number1))).value.toString()
    }

    fun plusNaturalWithNull(number1: Natural): Natural {
        return Natural(number1.value + 1.toBigInteger())
    }
}