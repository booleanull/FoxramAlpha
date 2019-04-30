package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q7Solution
import javax.inject.Inject

/**
@author Женя Ромаев
 */

class P3Solution : BaseSolution, PModule {

    @Inject
    lateinit var q7Solution: Q7Solution
    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(multiplyPolynomialWithFraction(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    private fun multiplyPolynomialWithFraction(number1: String, number2: String): String {
        val num1 = number1.split(" ").toMutableList()

        num1.forEachIndexed { index, it ->
            num1[index] = q7Solution.mulriplyFractionWithFraction(it, number2)
        }

        return num1.toStringList()
    }
}