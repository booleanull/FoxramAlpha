package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q7Solution
import javax.inject.Inject

/**
@author boolenull on 25.03.2019
 */

class P3Solution: BaseSolution, PModule {

    @Inject
    lateinit var q7Solution: Q7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return multiplyPolynomialWithFraction(solution.number1, solution.number2)
    }

    fun multiplyPolynomialWithFraction(number1: String, number2: String): String {
        var num1 = number1.split(" ").toMutableList()

        num1.forEachIndexed { index, it ->
            num1[index] = q7Solution.mulriplyFractionWithFraction(num1[index], number2)
        }

        return num1.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
    }
}