package managers.solution.qmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Никита Дубинин
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
        if(!frac1.contains("/") || !frac2.contains("/")) {
            return "Incorrect format"
        }

        val numerator = Fraction(frac1.split("/")[0]).value * Fraction(frac2.split("/")[0]).value
        val denominator = Fraction(frac1.split("/")[1]).value * Fraction(frac2.split("/")[1]).value
        var result = q1Solution.reduceFraction("$numerator/$denominator")
        return result
    }
}