package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q8Solution
import javax.inject.Inject

class P16Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p13Solution: P13Solution
    @Inject
    lateinit var q8Solution: Q8Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return convertChain(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2))
    }

    fun convertChain(number1: String, number2: String): String {
        val euclidBottom = p13Solution.solutionEuclid(number1, number2)[1]
        val chains = euclidBottom.subList(2, euclidBottom.size)

        val p = mutableListOf("1/1", "0/1")
        val q = mutableListOf("0/1", "1/1")

        var i = 2
        chains.forEach {
            p.add(p1Solution.plusPolynomialWithPolynomial(p[i - 2], p8Solution.multiplyPolynomialWithPolynomial(p[i - 1], it)))
            val polynomial = p8Solution.multiplyPolynomialWithPolynomial(q[i - 1], it)
            q.add(p1Solution.plusPolynomialWithPolynomial(q[i - 2], polynomial))
            i++
        }

        val result = mutableListOf<String>()
        for(i in 0 until p.size) {
            result.add("\\frac{${p1Solution.convertToNewFormat(p[i])}} " + "{${p1Solution.convertToNewFormat(q[i])}}")
        }

        return result.toString()
    }
}