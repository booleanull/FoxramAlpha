package solution.qmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 21.03.2019
 */

class Q7Solution: BaseSolution, QModule {

    @Inject
    lateinit var q1Solution: Q1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return mulriplyFractionWithFraction(solution.number1, solution.number2)
    }

    fun mulriplyFractionWithFraction(frac1: String, frac2: String): String {
        val numerator = Fraction(frac1.split("/")[0]).value * Fraction(frac2.split("/")[0]).value
        val denominator = Fraction(frac1.split("/")[1]).value * Fraction(frac2.split("/")[1]).value
        var result = q1Solution.reduceFraction("$numerator/$denominator")
        if(result[result.length - 1] == '1' && result[result.length - 2] == '/') {
            result = result.replace("/1", "")
        }
        return result
    }
}