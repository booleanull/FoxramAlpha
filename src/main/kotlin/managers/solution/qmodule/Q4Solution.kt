package managers.solution.qmodule

import controllers.solution.models.Solution
import managers.solution.base.BaseSolution
import managers.solution.zmodule.Whole

/**
@author Дмитрий Овечко
 */

class Q4Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        with(convertFractionToWhole(solution.number1)) {
            return when(this) {
                null -> "Incorrect format"
                else -> this.value.toString()
            }
        }
    }

    fun convertFractionToWhole(fraction: String): Whole? {
        return if(fraction.contains("/1")) {
            Whole(fraction.replace("/1", ""))
        } else {
            null
        }
    }
}