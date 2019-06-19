package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

class P14Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p11Solution: P11Solution
    @Inject
    lateinit var p13Solution: P13Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return diafantPolynomial(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2), p1Solution.convertToOlderFormat(solution.number3))
    }

    fun diafantPolynomial(number1: String, number2: String, number3: String): String {
        val euclid = p13Solution.solutionEuclid(number1, number2)
        val euclidR1 = euclid[2]
        val euclidR2 = euclid[3]
        val r1 = euclidR1[euclidR1.size - 2]
        val r2 = euclidR2[euclidR2.size - 2]
        val nod = p11Solution.nodPolynomial(number1, number2)
        val nodTest = p11Solution.nodPolynomial(nod, number3)
        if(nodTest != nod) return "Error"
        val x0 = p1Solution.convertToNewFormat(p8Solution.multiplyPolynomialWithPolynomial(r1, p9Solution.divisionPolynomialWithPolynomial(number3, nod)))
        val y0 = p1Solution.convertToNewFormat(p8Solution.multiplyPolynomialWithPolynomial(r2, p9Solution.divisionPolynomialWithPolynomial(number3, nod)))
        val x = p1Solution.convertToNewFormat(p9Solution.divisionPolynomialWithPolynomial(number2, nod))
        val y = p1Solution.convertToNewFormat(p9Solution.divisionPolynomialWithPolynomial(number1, nod))
        return "x = ($x0) + ($x)k; y = ($y0) - ($y)k;"
    }

    fun diafantPolynomialFor17(number1: String, number2: String, number3: String): String {
        val euclid = p13Solution.solutionEuclid(number1, number2)
        val euclidR1 = euclid[2]
        val euclidR2 = euclid[3]
        val r1 = euclidR1[euclidR1.size - 2]
        val r2 = euclidR2[euclidR2.size - 2]
        val nod = p11Solution.nodPolynomial(number1, number2)
        val y0 = p8Solution.multiplyPolynomialWithPolynomial(r2, p9Solution.divisionPolynomialWithPolynomial(number3, nod))
        return y0
    }
}