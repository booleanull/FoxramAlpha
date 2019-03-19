package solution

import daggerSolutionComponent
import solution.base.BaseSolution
import solution.nmodule.*
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
    @Inject
    lateinit var n5Solution: N5Solution
    @Inject
    lateinit var n6Solution: N6Solution
    @Inject
    lateinit var n7Solution: N7Solution
    @Inject
    lateinit var n8Solution: N8Solution
    @Inject
    lateinit var n9Solution: N9Solution
    @Inject
    lateinit var n10Solution: N10Solution
    @Inject
    lateinit var n11Solution: N11Solution
    @Inject
    lateinit var n12Solution: N12Solution
    @Inject
    lateinit var n13Solution: N13Solution
    @Inject
    lateinit var n14Solution: N14Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    fun generate(type: String): BaseSolution? {
        return when(type) {
            "N-1" -> n1Solution
            "N-2" -> n2Solution
            "N-3" -> n3Solution
            "N-4" -> n4Solution
            "N-5" -> n5Solution
            "N-6" -> n6Solution
            "N-7" -> n7Solution
            "N-8" -> n8Solution
            "N-9" -> n9Solution
            "N-10" -> n10Solution
            "N-11" -> n11Solution
            "N-12" -> n12Solution
            "N-13" -> n13Solution
            "N-14" -> n14Solution
            else -> null
        }
    }
}