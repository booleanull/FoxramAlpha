package controllers.solution

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.solution.models.Solution
import controllers.solution.responses.SolutionOkResponse
import daggerApplicationComponent
import spark.Spark.post
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class SolutionController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerApplicationComponent.inject(this)
    }

    override fun start() {
        println("SolutionController is enabled")
        initSolution()
    }

    private fun initSolution() {
        post("/api/solution", { req, res ->
            val data = gson.fromJson<Solution>(req.body(), Solution::class.java)

            return@post SolutionOkResponse(data.number.toString())
        }, gson::toJson)
    }
}