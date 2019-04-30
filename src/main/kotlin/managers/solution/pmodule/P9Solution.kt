package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q5Solution
import managers.solution.qmodule.Q7Solution
import managers.solution.qmodule.Q8Solution
import javax.inject.Inject


/**
@author Виталий Зуб
 */

class P9Solution : BaseSolution, PModule {

    @Inject
    lateinit var q5Solution: Q5Solution
    @Inject
    lateinit var q7Solution: Q7Solution
    @Inject
    lateinit var q8Solution: Q8Solution
    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(divisionPolynomialWithPolynomial(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    private fun divisionPolynomialWithPolynomial(number1: String, number2: String): String {
        val num1 = number1.split(" ").toMutableList()
        val num2 = number2.split(" ").toMutableList()

        val out = num1
        val normalizer = num2[0]
        val separator = num1.size - num2.size + 1
        for (i in 0 until separator) {
            out[i] = q8Solution.divisionFractionWithFraction(out[i], normalizer)
            val coef = out[i]
            if (coef != "0/1") {
                for (j in 1 until num2.size) out[i + j] = q5Solution.plusFractionWithFraction(out[i + j], q7Solution.mulriplyFractionWithFraction(q7Solution.mulriplyFractionWithFraction(num2[j], "-1/1"), coef))
            }
        }

        return out.subList(0, separator).toStringList()
    }
}