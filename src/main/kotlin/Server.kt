import controllers.settings.SettingsController
import controllers.solution.SolutionController
import controllers.test.TestController
import di.DaggerServerComponent
import di.DaggerSolutionComponent
import spark.Spark.port
import java.net.InetAddress
import java.text.SimpleDateFormat
import java.util.*

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
    if (args.isEmpty() || args[0].toIntOrNull() == null) {
        println("Post is empty")
        return
    }

    val port = args[0].toInt()
    initServer(port)

    val controllers = listOf(SettingsController(),
            SolutionController(),
            TestController())

    controllers.forEach { it.start() }
}

private fun initServer(port: Int) {
    val sdf = SimpleDateFormat("hh:mm dd/MM/yyyy")
    val date = sdf.format(Date())
    val version = String::class.java.getResource("/version.txt").readText()
    val ip = InetAddress.getLocalHost()
    port(port)

    println("=======================================")
    println("Port: $port")
    println("IP address: ${ip.hostAddress}")
    println("Version: $version")
    println("Date: $date")
    println("=======================================\n")
}