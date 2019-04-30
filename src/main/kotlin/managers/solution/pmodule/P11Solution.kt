package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject


/**
@author Виталий Зуб
 */

class P11Solution : BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p10Solution: P10Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(nodPolynomialWithPolynomial(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    private fun nodPolynomialWithPolynomial(number1: String, number2: String): String {
        var num1 = number1.split(" ").toMutableList()
        var num2 = number2.split(" ").toMutableList()

        while (num2.last() != "0/1") {
            val tmp = p10Solution.remainderPolynomialWithPolynomial(number1, number2)
            num1 = num2
            num2 = tmp.split(" ").toMutableList()
        }

        return num1.toStringList()
    }
}