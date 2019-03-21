package solution.qmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution
import solution.zmodule.Whole

/**
@author boolenull on 21.03.2019
 */

class Q3Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return (convertWholeToFraction(Whole(solution.number1))).toString()
    }

    fun convertWholeToFraction(whole: Whole): Fraction {
        return Fraction(whole.value)
    }
}