package managers.solution.zmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Эльвин Гусейнов
 */

class Z8Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (mulriplyWholeWithWhole(Whole(solution.number1), Whole(solution.number2)).value).toString()
    }

    fun mulriplyWholeWithWhole(number1: Whole, number2: Whole): Whole {
        return Whole(number1.value * number2.value)
    }
}