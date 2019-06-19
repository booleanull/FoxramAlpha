package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q6Solution
import javax.inject.Inject

/**
@author Максим Нигматулин
 */

class P2Solution : BaseSolution, PModule {

    @Inject
    lateinit var q6Solution: Q6Solution
    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(minusPolynomialWithPolynomial(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    fun minusPolynomialWithPolynomial(number1: String, number2: String): String {
        val num1 = number1.split(" ").toMutableList()
        val num2 = number2.split(" ").toMutableList()

        if (num1.size < num2.size) {
            for (i in 0..(num2.size - num1.size - 1)) {
                num1.add(0, "0/1")
            }
        } else {
            for (i in 0..(num1.size - num2.size - 1)) {
                num2.add(0, "0/1")
            }
        }

        num2.forEachIndexed { index, it ->
            num1[index] = q6Solution.minusFractionWithFraction(num1[index], it)
        }

        return num1.toStringList()
    }
}