package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Максим Нигматулин
 */

class P6Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(elderFactor(p1Solution.convertToOlderFormat(solution.number1)))
    }

    fun elderFactor(number1: String): String {
        return ((number1.split(" ")).size - 1).toString()
    }
}