package solution.qmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution
import solution.zmodule.Whole

/**
@author boolenull on 21.03.2019
 */

class Q4Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return (convertFractionToWhole(Fraction(solution.number1))).toString()
    }

    fun convertFractionToWhole(fraction: Fraction): Whole {
        return Whole(fraction.value)
    }
}