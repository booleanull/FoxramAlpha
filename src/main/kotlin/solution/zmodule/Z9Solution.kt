package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author Настя Чапурина on 17.03.2019
 */

class Z9Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (divisionWholeWithWhole(Whole(solution.number1), Whole(solution.number2)).value).toString()
    }

    fun divisionWholeWithWhole(number1: Whole, number2: Whole): Whole {
        return Whole(number1.value / number2.value)
    }
}