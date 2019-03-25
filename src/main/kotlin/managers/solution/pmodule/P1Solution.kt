package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q5Solution
import javax.inject.Inject

/**
@author boolenull on 25.03.2019
 */

class P1Solution: BaseSolution, PModule {

    @Inject
    lateinit var q5Solution: Q5Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return plusPolynomialWithPolynomial(solution.number1, solution.number2)
    }

    fun plusPolynomialWithPolynomial(number1: String, number2: String): String {
        var num1 = number1.split(" ").toMutableList()
        var num2 = number2.split(" ").toMutableList()

        if(num1.size < num2.size) {
            val temp = num1
            num1 = num2
            num2 = temp
        }

        num2.forEachIndexed { index, it ->
            num1[num1.size - num2.size + index] = q5Solution.plusFractionWithFraction(num1[num1.size - num2.size + index], it)
        }

        return num1.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
    }
}