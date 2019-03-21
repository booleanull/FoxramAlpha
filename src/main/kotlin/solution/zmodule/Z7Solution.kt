package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author Настя Чапурина on 17.03.2019
 */

class Z7Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (minusWholeWithWhole(Whole(solution.number1), Whole(solution.number2)).value).toString()
    }

    fun minusWholeWithWhole(number1: Whole, number2: Whole): Whole {
        return Whole(number1.value - number2.value)
    }
}