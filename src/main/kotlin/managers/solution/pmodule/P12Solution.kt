package managers.solution.pmodule

import Utils.toStringList
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

class P12Solution : BaseSolution, PModule {

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var q5Solution: Q5Solution
    @Inject
    lateinit var q7Solution: Q7Solution
    @Inject
    lateinit var q8Solution: Q8Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return derivativePolynonial(solution.number1)
    }

    fun derivativePolynonial(number: String): String {
        val num = number.split(" ").toMutableList()
        num.forEachIndexed { i, n ->
            val p = num.size - i - 1
            if (p != 0) {
                num[i] = q7Solution.mulriplyFractionWithFraction(n, "$p/1")
            }
        }

        return num.toStringList()
    }
}