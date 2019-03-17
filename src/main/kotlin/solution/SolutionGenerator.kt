package solution

import daggerSolutionComponent
import solution.base.BaseSolution
import solution.nmodule.N1Solution
import solution.nmodule.N2Solution
import solution.nmodule.N3Solution
import solution.nmodule.N4Solution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class SolutionGenerator {

    @Inject
    lateinit var n1Solution: N1Solution
    @Inject
    lateinit var n2Solution: N2Solution
    @Inject
    lateinit var n3Solution: N3Solution
    @Inject
    lateinit var n4Solution: N4Solution

    init {
        daggerSolutionComponent.inject(this)
    }


    fun generate(type: String): BaseSolution? {
        return when(type) {
            "COM_NN_D" -> n1Solution
            "NZER_N_B" -> n2Solution
            "ADD_1N_N" -> n3Solution
            "ADD_NN_N" -> n4Solution
            else -> null
        }
    }
}