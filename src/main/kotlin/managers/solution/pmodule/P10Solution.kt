package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q5Solution
import managers.solution.qmodule.Q7Solution
import managers.solution.qmodule.Q8Solution
import javax.inject.Inject


/**
@author Виталий Зуб
 */

class P10Solution : BaseSolution, PModule {

    @Inject
    lateinit var q5Solution: Q5Solution
    @Inject
    lateinit var q7Solution: Q7Solution
    @Inject
    lateinit var q8Solution: Q8Solution
    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p7Solution: P7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(remainderPolynomialWithPolynomial(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2)))
    }

    fun remainderPolynomialWithPolynomial(number1: String, number2: String): String {
        val del = p9Solution.divisionPolynomialWithPolynomial(number1, number2)
        val um = p8Solution.multiplyPolynomialWithPolynomial(number2, del)
        val ums = p8Solution.multiplyPolynomialWithPolynomial(um, "-1/1")

        val plusPolynomialWithPolynomial = p1Solution.plusPolynomialWithPolynomial(number1, ums)
        var f = false
        val stringBuilder = StringBuilder()
        plusPolynomialWithPolynomial.split(" ").forEach { s ->
            if(s != "0/1" || f) {
                stringBuilder.append("$s ")

            }
            if(s != "0/1") {
                f = true
            }
        }
        if(stringBuilder.toString().isEmpty()) return "0/1"
        var str = stringBuilder.toString().substring(0, stringBuilder.length - 1)
        return str //p9Solution.divisionPolynomialWithPolynomial(str, p7Solution.p7Function(str))
    }
}