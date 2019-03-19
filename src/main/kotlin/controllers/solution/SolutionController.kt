package controllers.solution

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.base.responses.BadRequestErrorResponse
import controllers.solution.models.Solution
import controllers.solution.responses.SolutionOkResponse
import daggerServerComponent
import solution.SolutionGenerator
import spark.Spark.post
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
    }

    private fun initSolution() {
        post("/api/solution", { req, res ->
            println("Connected from ${req.ip()}")
            val data = gson.fromJson<Solution>(req.body(), Solution::class.java)

            val solutionGenerator = SolutionGenerator()
            val solution = solutionGenerator.generate(data.type) ?: return@post BadRequestErrorResponse

            return@post SolutionOkResponse(solution.makeResult(data))
        }, gson::toJson)
    }
}