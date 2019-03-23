package managers.solution.zmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Эльвин Гусейнов
 */

class Z9Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (divisionWholeWithWhole(Whole(solution.number1), Whole(solution.number2)).value).toString()
    }

    fun divisionWholeWithWhole(number1: Whole, number2: Whole): Whole {
        return Whole(number1.value / number2.value)
    }
}