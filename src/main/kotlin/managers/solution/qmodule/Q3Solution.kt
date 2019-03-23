package managers.solution.qmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution
import managers.solution.zmodule.Whole

/**
@author Дмитрий Овечко
 */

class Q3Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return (convertWholeToFraction(Whole(solution.number1))).value.toString() + "/1"
    }

    fun convertWholeToFraction(whole: Whole): Fraction {
        return Fraction(whole.value)
    }
}