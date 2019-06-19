package managers.solution.qmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import java.math.BigInteger
import javax.inject.Inject

/**
@author Никита Дубинин
 */

class Q8Solution: BaseSolution, QModule {

    @Inject
    lateinit var q1Solution: Q1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return divisionFractionWithFraction(solution.number1, solution.number2)
    }

    fun divisionFractionWithFraction(frac1: String, frac2: String): String {
        val numerator = Fraction(frac1.split("/")[0]).value * Fraction(frac2.split("/")[1]).value
        val denominator = Fraction(frac1.split("/")[1]).value * Fraction(frac2.split("/")[0]).value
        var result = q1Solution.reduceFraction("$numerator/$denominator")
        return result
    }

    fun remainderFractionWithFraction(frac1: String, frac2: String): String {
        /*val f1 = q1Solution.reduceFraction(frac1)
        val f2 = q1Solution.reduceFraction(frac2)
        val numerator = Fraction(f1.split("/")[0]).value * Fraction(f2.split("/")[1]).value
        val denominator = Fraction(f1.split("/")[1]).value * Fraction(f2.split("/")[0]).value
        var result = "$numerator/$denominator"
        val res = result.split("/")
        val q = res[0].toBigInteger().abs() - res[1].toBigInteger().abs()
        return "$q/1"*/

        return (BigInteger(frac1.split("/")[0]) % BigInteger(frac2.split("/")[0])).abs().toString() + "/1"
    }

    fun divisionAFractionWithFraction(frac1: String, frac2: String): String {
        /*val f1 = q1Solution.reduceFraction(frac1)
        val f2 = q1Solution.reduceFraction(frac2)
        val numerator = Fraction(f1.split("/")[0]).value * Fraction(f2.split("/")[1]).value
        val denominator = Fraction(f1.split("/")[1]).value * Fraction(f2.split("/")[0]).value
        var result = "$numerator/$denominator"
        val res = result.split("/")
        val q = res[0].toBigInteger().abs() - res[1].toBigInteger().abs()
        return "$q/1"*/

        return (BigInteger(frac1.split("/")[0]) / BigInteger(frac2.split("/")[0])).abs().toString() + "/1"
    }
}