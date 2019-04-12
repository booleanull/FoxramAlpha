package di

import dagger.Component
import managers.solution.SolutionGenerator
import managers.solution.nmodule.*
import managers.solution.pmodule.*
import managers.solution.qmodule.Q5Solution
import managers.solution.qmodule.Q6Solution
import managers.solution.qmodule.Q7Solution
import managers.solution.qmodule.Q8Solution
import managers.solution.zmodule.Z1Solution
import javax.inject.Singleton

/**
@author boolenull on 17.03.2019
 */

@Singleton
@Component(modules = [SolutionModule::class])
interface SolutionComponent {

    fun inject(solutionGenerator: SolutionGenerator)

    fun inject(n5Solution: N5Solution)
    fun inject(n9Solution: N9Solution)
    fun inject(n10Solution: N10Solution)
    fun inject(n11Solution: N11Solution)
    fun inject(n12Solution: N12Solution)
    fun inject(n14Solution: N14Solution)

    fun inject(z1Solution: Z1Solution)

    fun inject(q5Solution: Q5Solution)
    fun inject(q6Solution: Q6Solution)
    fun inject(q7Solution: Q7Solution)
    fun inject(q8Solution: Q8Solution)

    fun inject(p1Solution: P1Solution)
    fun inject(p2Solution: P2Solution)
    fun inject(p3Solution: P3Solution)
    fun inject(p7Solution: P7Solution)
    fun inject(p8Solution: P8Solution)
    fun inject(p9Solution: P9Solution)
    fun inject(p10Solution: P10Solution)
    fun inject(p11Solution: P11Solution)
    fun inject(p12Solution: P12Solution)
}