package di

import dagger.Component
import solution.SolutionGenerator
import solution.nmodule.N10Solution
import solution.nmodule.N14Solution
import solution.nmodule.N5Solution
import solution.nmodule.N9Solution
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
    fun inject(n14Solution: N14Solution)
}