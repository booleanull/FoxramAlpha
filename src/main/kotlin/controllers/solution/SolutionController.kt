package controllers.solution

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.base.responses.BadRequestErrorResponse
import controllers.solution.models.FormData
import controllers.solution.models.Solution
import controllers.solution.responses.FormOkResponse
import controllers.solution.responses.SolutionResponse
import daggerServerComponent
import managers.form.FormGenerator
import managers.solution.SolutionGenerator
import spark.Spark.post
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


/**
@author boolenull on 17.03.2019
 */

class SolutionController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerServerComponent.inject(this)
    }

    override fun start() {
        println("SolutionController is enabled")
        initSolution()
        initForm()
    }

    private fun initSolution() {
        post("/api/solution", { req, res ->
            val data = gson.fromJson<Solution>(req.body(), Solution::class.java)
            val time = SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().time)
            println("[LOG][${data.type}] Connected from ${req.ip()} in $time")

            val solutionGenerator = SolutionGenerator()
            val solution = solutionGenerator.generate(data.type) ?: return@post BadRequestErrorResponse

            return@post SolutionResponse().build(solution.makeResult(data))
        }, gson::toJson)
    }

    private fun initForm() {
        post("/api/form", { req, res ->
            val data = gson.fromJson<FormData>(req.body(), FormData::class.java)

            val formGenerator = FormGenerator()
            val form = formGenerator.generate(data.type) ?: return@post BadRequestErrorResponse

            return@post FormOkResponse(form)
        }, gson::toJson)
    }
}