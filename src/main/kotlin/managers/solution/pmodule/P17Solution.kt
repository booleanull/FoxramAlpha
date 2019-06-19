package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q8Solution
import javax.inject.Inject

class P17Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p13Solution: P13Solution
    @Inject
    lateinit var p14Solution: P14Solution
    @Inject
    lateinit var q8Solution: Q8Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(convertChine(solution.number1, solution.number2))
    }

    fun convertChine(number1: String, number2: String): String {
        val m = number1.split(";").map { p1Solution.convertToOlderFormat(it) }
        val r = number2.split(";").map { p1Solution.convertToOlderFormat(it) }
        var mainR = "1/1"
        r.forEach {
            mainR = p8Solution.multiplyPolynomialWithPolynomial(mainR, it)
        }
        val rI = mutableListOf<String>()
        r.forEach {
            rI.add(p9Solution.divisionPolynomialWithPolynomial(mainR, it))
        }

        val y = mutableListOf<String>()
        m.forEachIndexed { index, string ->
            val k = p14Solution.diafantPolynomialFor17(p8Solution.multiplyPolynomialWithPolynomial(r[index], "-1/1"), rI[index], m[index])
            y.add(k)
        }

        var result = "0/1"
        rI.forEachIndexed { index, string ->
            result = p1Solution.plusPolynomialWithPolynomial(result, p8Solution.multiplyPolynomialWithPolynomial(rI[index], y[index]))
        }

        return result
    }
}