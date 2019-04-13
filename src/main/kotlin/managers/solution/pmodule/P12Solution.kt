package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q7Solution
import javax.inject.Inject


/**
@author Виталий Зуб
 */

class P12Solution : BaseSolution, PModule {

    @Inject
    lateinit var q7Solution: Q7Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return derivativePolynonial(solution.number1)
    }

    private fun derivativePolynonial(number: String): String {
        val num = number.split(" ").toMutableList()
        num.forEachIndexed { i, n ->
            val p = num.size - i - 1
            num[i] = q7Solution.mulriplyFractionWithFraction(n, "$p/1")
        }

        return num.subList(0, num.size - 1).toStringList()
    }
}