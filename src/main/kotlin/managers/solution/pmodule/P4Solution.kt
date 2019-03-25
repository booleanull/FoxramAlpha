package managers.solution.pmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution

/**
@author boolenull on 25.03.2019
 */

class P4Solution: BaseSolution, PModule {

    override fun makeResult(solution: Solution): String {
        return addPolynomialZero(solution.number1, solution.digit)
    }

    fun addPolynomialZero(number1: String, digit: Int): String {
        val stringBuilder = StringBuilder(number1)
        for(i in 0..(digit - 1)) {
            stringBuilder.append(" 0/1")
        }

        return stringBuilder.toString()
    }
}