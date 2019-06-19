package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

class P11Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p13Solution: P13Solution
    @Inject
    lateinit var p5Solution: P5Solution
    @Inject
    lateinit var p9Solution: P9Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(nod(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    fun nodPolynomial(number1: String, number2: String): String {
        val euclidTop = p13Solution.solutionEuclid(number1, number2)[0]
        val nod = euclidTop[euclidTop.size - 2]
        return nod //p9Solution.divisionPolynomialWithPolynomial(nod, p5Solution.elderFactor(nod))
    }

    fun nod(number1: String, number2: String): String {
        val euclidTop = p13Solution.solutionEuclid(number1, number2)[0]
        val nod = euclidTop[euclidTop.size - 2]
        return p9Solution.divisionPolynomialWithPolynomial(nod, p5Solution.elderFactor(nod))
    }
}