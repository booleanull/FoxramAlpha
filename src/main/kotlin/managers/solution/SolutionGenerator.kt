package managers.solution

import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.nmodule.*
import managers.solution.pmodule.*
import managers.solution.qmodule.*
import managers.solution.zmodule.*
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

    @Inject
    lateinit var z1Solution: Z1Solution
    @Inject
    lateinit var z2Solution: Z2Solution
    @Inject
    lateinit var z3Solution: Z3Solution
    @Inject
    lateinit var z4Solution: Z4Solution
    @Inject
    lateinit var z5Solution: Z5Solution
    @Inject
    lateinit var z6Solution: Z6Solution
    @Inject
    lateinit var z7Solution: Z7Solution
    @Inject
    lateinit var z8Solution: Z8Solution
    @Inject
    lateinit var z9Solution: Z9Solution
    @Inject
    lateinit var z10Solution: Z10Solution

    @Inject
    lateinit var q1Solution: Q1Solution
    @Inject
    lateinit var q2Solution: Q2Solution
    @Inject
    lateinit var q3Solution: Q3Solution
    @Inject
    lateinit var q4Solution: Q4Solution
    @Inject
    lateinit var q5Solution: Q5Solution
    @Inject
    lateinit var q6Solution: Q6Solution
    @Inject
    lateinit var q7Solution: Q7Solution
    @Inject
    lateinit var q8Solution: Q8Solution

    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p2Solution: P2Solution
    @Inject
    lateinit var p3Solution: P3Solution
    @Inject
    lateinit var p4Solution: P4Solution
    @Inject
    lateinit var p5Solution: P5Solution
    @Inject
    lateinit var p6Solution: P6Solution
    @Inject
    lateinit var p7Solution: P7Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p10Solution: P10Solution
    @Inject
    lateinit var p11Solution: P11Solution
    @Inject
    lateinit var p12Solution: P12Solution

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

            "Z-1" -> z1Solution
            "Z-2" -> z2Solution
            "Z-3" -> z3Solution
            "Z-4" -> z4Solution
            "Z-5" -> z5Solution
            "Z-6" -> z6Solution
            "Z-7" -> z7Solution
            "Z-8" -> z8Solution
            "Z-9" -> z9Solution
            "Z-10" -> z10Solution

            "Q-1" -> q1Solution
            "Q-2" -> q2Solution
            "Q-3" -> q3Solution
            "Q-4" -> q4Solution
            "Q-5" -> q5Solution
            "Q-6" -> q6Solution
            "Q-7" -> q7Solution
            "Q-8" -> q8Solution

            "P-1" -> p1Solution
            "P-2" -> p2Solution
            "P-3" -> p3Solution
            "P-4" -> p4Solution
            "P-5" -> p5Solution
            "P-6" -> p6Solution
            "P-7" -> p7Solution
            "P-8" -> p8Solution
            "P-9" -> p9Solution
            "P-10" -> p10Solution
            "P-11" -> p11Solution
            "P-12" -> p12Solution
            else -> null
        }
    }
}