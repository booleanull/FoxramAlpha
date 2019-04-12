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

class P8Solution : BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var q7Solution: Q7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return multiplyPolynomialWithPolynomial(solution.number1, solution.number2)
    }

    fun multiplyPolynomialWithPolynomial(number1: String, number2: String): String {
        val num1 = number1.split(" ").toMutableList()
        val num2 = number2.split(" ").toMutableList()
        var res = "0/1"
        var number = StringBuilder()

        num1.forEachIndexed { i, n1 ->
            num2.forEachIndexed { j, n2 ->
                number.append(q7Solution.mulriplyFractionWithFraction(n1, n2))
                number.append(" ")
            }
            for (k in 1 until num1.size - i) {
                number.append("0/1 ")
            }
            number.deleteCharAt(number.lastIndex)
            res = p1Solution.plusPolynomialWithPolynomial(res, number.toString())
            number = StringBuilder()
        }

        return res.toMutableList().toStringList()
                .replace("  ", "&")
                .replace(" ", "")
                .replace("&", " ")
    }
}