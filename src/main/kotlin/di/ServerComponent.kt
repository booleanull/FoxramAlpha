package di

import controllers.solution.SolutionController
import controllers.test.TestController
import dagger.Component
import managers.form.FormGenerator
import javax.inject.Singleton

/**
@author boolenull on 17.03.2019
 */

@Singleton
@Component(modules = [GsonModule::class])
interface ServerComponent {

    fun inject(testController: TestController)
    fun inject(solutionController: SolutionController)

    fun inject(formGenerator: FormGenerator)
}