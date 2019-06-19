package managers.solution.qmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author Леонид Никулин
 */

class Q1Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return reduceFraction(solution.number1)
    }

    fun reduceFraction(frac: String): String {
        val fraction = frac.split("/").map { Fraction(it) }
        val nod = fraction[0].value.gcd(fraction[1].value)
        fraction.forEach { it.value /= nod }
        if(fraction[1].value < 0.toBigInteger()) {
            if(fraction[0].value < 0.toBigInteger()) {
                fraction[0].value = fraction[0].value.abs()
                fraction[1].value = fraction[1].value.abs()
            }
            else {
                fraction[0].value = fraction[0].value * (-1).toBigInteger()
                fraction[1].value = fraction[1].value.abs()
            }
        }
        return "${fraction[0].value}/${fraction[1].value}"
    }
}