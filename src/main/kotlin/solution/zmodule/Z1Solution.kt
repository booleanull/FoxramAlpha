package solution.zmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 21.03.2019
 */

class Z1Solution: BaseSolution, ZModule {

    @Inject
    lateinit var z2Solution: Z2Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return (getAbsWhole(Whole(solution.number1)).value).toString()
    }

    fun getAbsWhole(whole: Whole): Whole {
        return when(z2Solution.compareWholeNumbers(whole)) {
            false -> Whole(whole.value.abs())
            else -> whole
        }
    }
}