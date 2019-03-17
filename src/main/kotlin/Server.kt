import controllers.solution.SolutionController
import controllers.solution.models.Solution
import controllers.test.TestController
import di.DaggerServerComponent
import di.DaggerSolutionComponent
import solution.nmodule.N4Solution
import spark.Spark.port

/**
@author boolenull on 17.03.2019
 */

val daggerServerComponent = DaggerServerComponent
        .builder()
        .build()

val daggerSolutionComponent = DaggerSolutionComponent
        .builder()
        .build()

fun main(args: Array<String>) {

    if(args.isEmpty() || args[0].toIntOrNull() == null) {
        println("Post is empty")
        return
    }

    port(args[0].toInt())

    val contollers = listOf(SolutionController(), TestController())
    contollers.forEach { it.start() }
}