package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 19.03.2019
 */

class N0Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return solution.number1
    }
}