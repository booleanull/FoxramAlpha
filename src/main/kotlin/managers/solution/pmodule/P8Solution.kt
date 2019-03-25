package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q5Solution
import managers.solution.qmodule.Q7Solution
import javax.inject.Inject

/**
@author boolenull on 25.03.2019
 */

class P8Solution: BaseSolution, PModule {

    @Inject
    lateinit var q5Solution: Q5Solution
    @Inject
    lateinit var q7Solution: Q7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return multiplyFractionWithFraction(solution.number1, solution.number2)
    }

    fun multiplyFractionWithFraction(number1: String, number2: String): String {
        val num1 = number1.split(" ").toMutableList()
        val num2 = number2.split(" ").toMutableList()
        val res = arrayOfNulls<String>(num1.size + num2.size - 1)
        num1.forEachIndexed { index, s -> res[index] = s }
        num2.forEachIndexed { index, s -> res[index] = s }

        num1.forEachIndexed { i, n1 ->
            num2.forEachIndexed { j, n2 ->
                res[i + j] = q5Solution.plusFractionWithFraction(res[i + j]!!, q7Solution.mulriplyFractionWithFraction(n1, n2))
            }
        }

        return res.toMutableList().toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
    }
}