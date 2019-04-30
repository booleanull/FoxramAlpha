package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.nmodule.N13Solution
import managers.solution.nmodule.N14Solution
import managers.solution.nmodule.Natural
import javax.inject.Inject

/**
@author Женя Ромаев
 */

class P7Solution: BaseSolution, PModule {

    @Inject
    lateinit var n13Solution: N13Solution
    @Inject
    lateinit var n14Solution: N14Solution
    @Inject
    lateinit var p1Solution: P1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return p1Solution.convertToNewFormat(p7Function(p1Solution.convertToOlderFormat(solution.number1)))
    }

    private fun p7Function(number1: String): String {
        val num1 = number1.split(" ")
        var nod = (num1[0].split("/"))[0]
        var nok = (num1[0].split("/"))[1]
        num1.forEach {
            nod = n13Solution.nodNaturalWithNatural((Natural(nod)), Natural(it.split("/")[0])).value.toString()
            nok = n14Solution.nokNaturalWithNatural((Natural(nok)), Natural(it.split("/")[1])).value.toString()
        }

        return "$nod/$nok"
    }
}