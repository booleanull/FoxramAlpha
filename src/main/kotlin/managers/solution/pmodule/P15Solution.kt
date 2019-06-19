package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import javax.inject.Inject

class P15Solution: BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p6Solution: P6Solution
    @Inject
    lateinit var p13Solution: P13Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return convertChain(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2))
    }

    fun convertChain(number1: String, number2: String): String {
        val euclidBottom = p13Solution.solutionEuclid(number1, number2)[1]
        val chains = euclidBottom.subList(2, euclidBottom.size).toMutableList()
        if(p6Solution.elderFactor(number1) < p6Solution.elderFactor(number2)) chains.add(0, "0/1")
        val result = chains.map { p1Solution.convertToNewFormat(it) }.toString()
        val stringBuilder = StringBuilder()
        var t = true
        result.forEach {
            if(it == ',' && t) {
                t = false
                stringBuilder.append(';')
            }
            else {
                stringBuilder.append(it)
            }
        }
        return stringBuilder.toString()
    }
}