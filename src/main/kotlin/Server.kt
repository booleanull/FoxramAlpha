import controllers.settings.SettingsController
import controllers.solution.SolutionController
import controllers.test.TestController
import di.DaggerServerComponent
import di.DaggerSolutionComponent
import spark.Spark.port
import java.net.InetAddress

/**
@author boolenull on 18.03.2019
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

    val port = args[0].toInt()
    port(port)
    println("You port - $port")

    val ip = InetAddress.getLocalHost()
    println("Current IP address : " + ip.hostAddress)
    println("Version is 1.0")

    val controllers = listOf(SettingsController(),
            SolutionController(),
            TestController())
    controllers.forEach { it.start() }
}