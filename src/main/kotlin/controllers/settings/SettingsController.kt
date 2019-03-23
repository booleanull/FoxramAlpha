package controllers.settings

import controllers.base.BaseController
import spark.Spark

/**
@author boolenull on 19.03.2019
 */

class SettingsController: BaseController {

    override fun start() {
        initOptions()
        initBeforeMethod()
    }

    fun initOptions() {
        Spark.options("/*"
        ) { request, response ->

            val accessControlRequestHeaders = request
                    .headers("Access-Control-Request-Headers")
            if(accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                        accessControlRequestHeaders)
            }

            val accessControlRequestMethod = request
                    .headers("Access-Control-Request-Method")
            if(accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods",
                        accessControlRequestMethod)
            }

            "OK"
        }
    }

    fun initBeforeMethod() {
        Spark.before("*") { req, res ->
            res.header("Access-Control-Allow-Origin", "*")
        }
    }
}