package controllers.settings

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.base.responses.BaseOkResponse
import daggerServerComponent
import managers.form.FormGenerator
import managers.form.models.Form
import spark.Spark
import javax.inject.Inject

/**
@author boolenull on 19.03.2019
 */

class SettingsController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerServerComponent.inject(this)
    }

    override fun start() {
        initOptions()
        initBeforeMethod()
        initRestartData()

        getFormFromFile()
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

    fun initRestartData() {
        Spark.post("/api/restart", { req, res ->
            getFormFromFile()
            return@post BaseOkResponse()
        }, gson::toJson)
    }

    private fun getFormFromFile() {
        val formText = String::class.java.getResource("/forms.json").readText()
        FormGenerator.forms = gson.fromJson(formText, Array<Form>::class.java).toList()
    }
}