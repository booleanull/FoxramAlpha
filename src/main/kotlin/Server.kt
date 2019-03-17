import controllers.solution.SolutionController
import controllers.test.TestController
import di.DaggerApplicationComponent
import spark.Spark.port

/**
@author boolenull on 17.03.2019
 */

val daggerApplicationComponent = DaggerApplicationComponent
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