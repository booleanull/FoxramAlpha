package di

import dagger.Component
import solution.SolutionGenerator
import solution.nmodule.N4Solution
import javax.inject.Singleton

/**
@author boolenull on 17.03.2019
 */

@Singleton
@Component(modules = [SolutionModule::class])
interface SolutionComponent {

    fun inject(solutionGenerator: SolutionGenerator)
    fun inject(n4Solution: N4Solution)
}