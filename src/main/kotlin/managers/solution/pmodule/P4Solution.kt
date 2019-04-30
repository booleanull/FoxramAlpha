package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Женя Ромаев
 */

class P4Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(addPolynomialZero(p1Solution.convertToOlderFormat(solution.number1), solution.digit))
    }

    private fun addPolynomialZero(number1: String, digit: Int): String {
        val stringBuilder = StringBuilder(number1)
        for(i in 0..(digit - 1)) {
            stringBuilder.append(" 0/1")
        }

        return stringBuilder.toString()
    }
}