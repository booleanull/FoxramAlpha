package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import java.math.BigInteger
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N14Solution: BaseSolution, NModule {

    @Inject
    lateinit var n13Solution: N13Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return nokNaturalWithNatural(Natural(solution.number1), Natural(solution.number2)).toString()
    }

    fun nokNaturalWithNatural(number1: Natural, number2: Natural): BigInteger {
        return (number1.value * number2.value) / n13Solution.nodNaturalWithNatural(number1, number2).value
    }
}