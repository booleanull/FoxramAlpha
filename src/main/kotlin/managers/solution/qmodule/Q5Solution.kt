package managers.solution.qmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

/**
@author Никита Дубинин
 */

class Q5Solution: BaseSolution, QModule {

    @Inject
    lateinit var q1Solution: Q1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return plusFractionWithFraction(solution.number1, solution.number2)
    }

    fun plusFractionWithFraction(frac1: String, frac2: String): String {
        if(!frac1.contains("/") || !frac2.contains("/")) {
            return "Incorrect format"
        }

        val fraction1 = q1Solution.reduceFraction(frac1)
        val fraction2 = q1Solution.reduceFraction(frac2)

        val frC1 = Fraction(fraction1.split("/")[0])
        val frZ1 = Fraction(fraction1.split("/")[1])
        val frC2 = Fraction(fraction2.split("/")[0])
        val frZ2 = Fraction(fraction2.split("/")[1])

        val nod = frZ1.value.gcd(frZ2.value)
        val nok = (frZ1.value * frZ2.value) / nod
        frC1.value = frC1.value * (nok / frZ1.value)
        frC2.value = frC2.value * (nok / frZ2.value)
        val numerator = frC1.value + frC2.value

        var result = q1Solution.reduceFraction("$numerator/$nok")
        return result
    }
}